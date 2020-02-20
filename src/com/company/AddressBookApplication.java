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

public class AddressBookApplication extends Menu {

    public static void main(String[] args) throws IOException {

        /** The address book object will contain a list of all the entry objects
         */
        AddressBook ab = new AddressBook();

        /** The menu will return after each option is run
         */
        while(true) {
            Menu.menu(ab);
        }
    }
}
