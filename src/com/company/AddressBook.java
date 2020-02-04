/** This AddressBook creates an array for entry objects and keeps count of the number of entries.
 *  It contains a variables about Number_of_Entries, Address_Entry_List
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.1
 */

package com.company;

public class AddressBook {

    /** Number_of_Entries in the Address_Book represented by an integer
     */
    int entries;

    /** Array of class object Address_Entries in the Address_Book
     */
    AddressEntry[] AddressEntryList;

    /** Default constructor for Address_Book creating size 10 array with 0 entries
     * @returns nothing
     */
    public AddressBook() {
        AddressEntryList = new AddressEntry[10];
        entries = 0;
    }

    /** Uses a loop to print out the Address_Entry object information in the Address_Book array
     * @returns nothing
     */
    public void list() {
        for(int i = 0; i < entries; i++) {
            System.out.println(AddressEntryList[i].toString());
        }
    }

    /** Takes an Address_Entry object and adds it to the end of the Address_Book array list
     * If the number of entries reaches the maximum number of array objects,
     * the list is expanded by copying the list to a new larger list.
     * @param AddressEntry ae is a predefined Address_Entry with information
     * @returns nothing
     */
    public void add(AddressEntry ae) {
        AddressEntryList[entries] = ae;
        entries++;
        if (entries >= AddressEntryList.length) {
            AddressEntry[] NewList = new AddressEntry[entries + 10];
            for (int i = 0; i < entries; i++)
                NewList[i] = AddressEntryList[i];
            AddressEntryList = NewList;
        }
    }
}
