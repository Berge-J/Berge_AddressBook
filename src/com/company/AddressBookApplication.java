/** This program will create an address book object with a list of entry objects.
 *  Each entry object has information on a person and their contact information
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.io.*;

import static java.lang.Integer.valueOf;

public class AddressBookApplication {

    /** Creates new pre-filled address entries then adds them to the book object
     * Lists all of the entries included in the book object
     * @param AddressBook ab is the Address_Book object to contain Address_Entry objects
     * @returns nothing
     */
    /* No longer used in project
    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry ae = new AddressEntry("James", "Markson", "1234 Good st.", "Hayward", "CA", 94540, "510-555-1234", "JMarkson@gmail.com");
        AddressEntry ae2 = new AddressEntry("Layla", "Snat", "333 Great st.", "Hayward", "CA", 94540, "510-555-5446", "LSnat@gmail.com");
        ab.add(ae);
        ab.add(ae2);
        ab.list();

    }
     */

    public static void init(String filename, AddressBook ab) throws IOException {
        String line;
        FileReader file_input = new FileReader(filename);
        BufferedReader BR = new BufferedReader(file_input);

        while((line = BR.readLine()) != null) {
            AddressEntry ae = new AddressEntry(line, BR.readLine(), BR.readLine(), BR.readLine(), BR.readLine(), (Integer.valueOf(BR.readLine())).intValue(), BR.readLine(), BR.readLine());
            ab.add(ae);
        }
        BR.close();
        file_input.close();
    }

    public static void main(String[] args) throws IOException {

        /** The address book object will contain a list of all the entry objects
         */
        AddressBook ab = new AddressBook();

        /** Call the menu function that creates two predefined entry objects,
         * adds them to the list of objects in the AddressBook object, then prints the list.
         */
        init("C:\\Users\\berge\\Documents\\CS401\\AddressInputDataFile.txt", ab);
        while(true) {
            Menu.menu();
        }
    }
}
