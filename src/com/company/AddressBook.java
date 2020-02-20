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

    /** Takes a user defined string and calls the find function, then allows user to choose items to remove.
     * Items are removed based on their index number.
     * @param String lastName is user input for searching list of entries
     * @returns nothing
     */
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

    /** Takes a user defined string then alphabetized the Address_Entry objects in the Address_Book.
     * The string is compared to each Address_Entry lastName variable, then the matching entries are printed.
     * Items are removed based on their index number.
     * @param String lastName is user input for searching list of entries
     * @returns nothing
     */
    public void find(String lastName) {
        //capitalize first character
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        Collections.sort(AddressEntryList);
        for (AddressEntry AddressEntry : AddressEntryList) {
            if (AddressEntry.getLastName().contains(lastName)) {
                System.out.println((AddressEntryList.indexOf(AddressEntry) + 1) + ". " + AddressEntry.toString());
            }
        }
    }
}
