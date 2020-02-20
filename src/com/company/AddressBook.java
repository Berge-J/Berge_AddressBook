/** This AddressBook creates a list for entry objects and keeps count of the number of entries.
 *  It contains variables about Number_of_Entries, Address_Entry_List and functions for listing and adding entries
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */

package com.company;
import java.util.*;

public class AddressBook {

    Scanner input = new Scanner(System.in);
    /** ArrayList of class object Address_Entries in the Address_Book
     */
    ArrayList<AddressEntry> AddressEntryList = new ArrayList<AddressEntry>();

    /** Default constructor for Address_Book
     * @returns nothing
     */
    public AddressBook() {}

    /** Uses a loop to print out the Address_Entry object information in the Address_Book List
     * @returns nothing
     */
    public void list() {
        Collections.sort(AddressEntryList);
        for(AddressEntry AddressEntry : AddressEntryList)
            System.out.println(AddressEntry.toString());
    }

    /** Takes an Address_Entry object and adds it to the end of the Address_Book list
     * @param AddressEntry ae is a predefined Address_Entry with information
     * @returns nothing
     */
    public void add(AddressEntry ae) {
        AddressEntryList.add(ae);
    }

    public void remove(String lastName) {
        int choice = 0;
        find(lastName);
        while (choice != -1) {
            System.out.println("Choose entry number to remove (0 to stop):");
            choice = input.nextInt()-1;
            if (choice != -1) {
                System.out.println("Removed " + AddressEntryList.get(choice).getFirstName() + " " + AddressEntryList.get(choice).getLastName() + "\n");
                AddressEntryList.remove(choice);
            }
            find(lastName);
        }
    }

    public void find(String lastName) {
        Collections.sort(AddressEntryList);
        for (AddressEntry AddressEntry : AddressEntryList) {
            if (AddressEntry.getLastName().contains(lastName)) {
                System.out.println((AddressEntryList.indexOf(AddressEntry) + 1) + ". " + AddressEntry.toString());
            }
        }
    }
}
