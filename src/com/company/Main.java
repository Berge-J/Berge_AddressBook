/** This program will create an address book object with a list of entry objects.
 *  Each entry object has information on a person and their contact information
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.1
 */

package com.company;
public class Main {

    public static void main(String[] args) {

        /** The address book object will contain a list of all the entry objects
         */
        AddressBook ab = new AddressBook();

        /** Call the menu function that creates two predefined entry objects,
         * adds them to the list of objects in the AddressBook object, then prints the list.
         */
        Menu.initAddressBookExercise(ab);
    }
}
