/** This program will create an address book object with a list of entry objects.
 *  Each entry object has information on a person and their contact information
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */

package com.company;
public class Main {

    /** Creates new pre-filled address entries then adds them to the book object
     * Lists all of the entries included in the book object
     * @param AddressBook ab is the Address_Book object to contain Address_Entry objects
     * @returns nothing
     */
    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry ae = new AddressEntry("James", "Markson", "1234 Good st.", "Hayward", "CA", 94540, "510-555-1234", "JMarkson@gmail.com");
        AddressEntry ae2 = new AddressEntry("Layla", "Snat", "333 Great st.", "Hayward", "CA", 94540, "510-555-5446", "LSnat@gmail.com");
        ab.add(ae);
        ab.add(ae2);
        ab.list();

    }
    public static void main(String[] args) {

        /** The address book object will contain a list of all the entry objects
         */
        AddressBook ab = new AddressBook();

        /** Call the menu function that creates two predefined entry objects,
         * adds them to the list of objects in the AddressBook object, then prints the list.
         */
        initAddressBookExercise(ab);
    }
}
