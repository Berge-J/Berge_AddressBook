/** This AddressBook creates a list for entry objects and keeps count of the number of entries.
 *  It contains variables about Number_of_Entries, Address_Entry_List and functions for listing and adding entries
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */

package com.company;
import java.util.*;

public class AddressBook {

    /** Number_of_Entries in the Address_Book represented by an integer
     */
    int entries;

    /** ArrayList of class object Address_Entries in the Address_Book
     */
    List<AddressEntry> AddressEntryList = new ArrayList<>();

    /** Default constructor for Address_Book
     * @returns nothing
     */
    public AddressBook() {
        entries = 0;
    }

    /** Uses a loop to print out the Address_Entry object information in the Address_Book List
     * @returns nothing
     */
    public void list() {
        for(AddressEntry AddressEntry : AddressEntryList)
            System.out.println(AddressEntry.toString());
    }

    /** Takes an Address_Entry object and adds it to the end of the Address_Book list
     * If the number of entries reaches the maximum number of objects,
     * the list is expanded by copying the list to a new larger list.
     * @param AddressEntry ae is a predefined Address_Entry with information
     * @returns nothing
     */
    public void add(AddressEntry ae) {
        AddressEntryList.add(ae);
        entries++;
    }
}
