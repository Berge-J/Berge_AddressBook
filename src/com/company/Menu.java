/** This Menu class runs the functions for the main program.
 *  It contains prompts from EX1 and initAddressBookExercise from EX2.
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */
package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    /** Menu system based on user input. Calls functions from Menu class and AddressBook class.
     * Uses a switch statement based on user input to modify AddressBook.
     * @param AddressBook abk original Address_Book object to be modified
     * @returns nothing
     */
    public static void menu(AddressBook abk) throws IOException {
        Scanner input = new Scanner(System.in);
        int choice;
        String lName;
        System.out.println("------------");
        System.out.println("Address Book");
        System.out.println("------------");
        System.out.println("1. Load Address Book From File");
        System.out.println("2. Add New Address");
        System.out.println("3. Remove Address");
        System.out.println("4. Find Address");
        System.out.println("5. List Addresses");
        System.out.println("6. Quit" + "\n");
        System.out.println("Make Selection: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                abk = load(abk);
                break;
            case 2:
                abk = add(abk);
                System.out.println("Address Added");
                break;
            case 3:
                System.out.println("Enter Last Name to Remove: ");
                lName = input.next();
                abk.remove(lName);
                break;
            case 4:
                System.out.println("Enter Last Name to Find: ");
                lName = input.next();
                abk.find(lName);
                break;
            case 5:
                abk.list();
                break;
            default:
                System.exit(0);
        }
    }

    /** Menu option for loading Address_Entry objects to Address_Book from file.
     * Prompts user for file name, then checks if it exists. If file exists, loads Address_Entries from file.
     * Outputs number of Address_Entry objects added and total.
     * @param AddressBook ab original Address_Book object to be added to
     * @returns AddressBook ab Address_Book object with new entry
     */
    public static AddressBook load(AddressBook ab) throws IOException {
        Scanner input = new Scanner(System.in);
        String line;
        int counter = 0;
        System.out.println("Enter FileName: ");
        String filename = input.next();
        if (new File("resources\\" + filename).exists())
        {
            FileReader file_input = new FileReader("resources\\" + filename);
            BufferedReader BR = new BufferedReader(file_input);

            while((line = BR.readLine()) != null) {
                AddressEntry ae = new AddressEntry(line, BR.readLine(), BR.readLine(), BR.readLine(), BR.readLine(), (Integer.valueOf(BR.readLine())).intValue(), BR.readLine(), BR.readLine());
                ab.add(ae);
                counter++;
            }
            BR.close();
            file_input.close();
            System.out.println(counter + " New Addresses Loaded. " + ab.AddressEntryList.size() + " Addresses Total.");
            return ab;
        } else {
            System.out.println("File Not Found.");
            return ab;
        }

    }

    /** Menu option for adding new entry prompts user for information then adds Address_Entry to Address_Book
     * @param AddressBook ab original Address_Book object to be added to
     * @returns AddressBook ab Address_Book object with new entry
     */
    public static AddressBook add(AddressBook ab) {
        AddressEntry ae = new AddressEntry(prompt_FirstName(), prompt_LastName(), prompt_Street(), prompt_City(), prompt_State(), prompt_Zip(), prompt_Telephone(), prompt_Email());
        System.out.println("\n" + ae.toString());
        ab.add(ae);
        return ab;
    }

    /** Print prompt for user input
     *  @returns String fn First_Name
     */
    public static String prompt_FirstName() {

        Scanner input = new Scanner(System.in);
        System.out.println("First Name:");
        String fn = input.next();
        //capitalize first character
        fn = fn.substring(0, 1).toUpperCase() + fn.substring(1);
        return fn;

    }

    /** Print prompt for user input
     *  @returns String ln Last_Name
     */
    public static String prompt_LastName() {

        Scanner input = new Scanner(System.in);
        System.out.println("Last Name:");
        String ln = input.next();
        //capitalize first character
        ln = ln.substring(0, 1).toUpperCase() + ln.substring(1);
        return ln;

    }

    /** Print prompt for user input
     *  @returns String st street
     */
    public static String prompt_Street() {

        Scanner input = new Scanner(System.in);
        System.out.println("Street:");
        String st = input.next();
        return st;

    }

    /** Print prompt for user input
     *  @returns String ct city
     */
    public static String prompt_City() {

        Scanner input = new Scanner(System.in);
        System.out.println("City:");
        String ct = input.next();
        return ct;

    }

    /** Print prompt for user input
     *  @returns String sta state
     */
    public static String prompt_State() {

        Scanner input = new Scanner(System.in);
        System.out.println("State:");
        String sta = input.next();
        return sta;

    }

    /** Print prompt for user input
     *  @returns Int zip zip code
     */
    public static int prompt_Zip() {

        Scanner input = new Scanner(System.in);
        System.out.println("Zip:");
        int zip = input.nextInt();
        return zip;

    }

    /** Print prompt for user input
     *  @returns String tel telephone number
     */
    public static String prompt_Telephone() {

        Scanner input = new Scanner(System.in);
        System.out.println("Telephone:");
        String tel = input.next();
        return tel;

    }

    /** Print prompt for user input
     *  @returns String em email
     */
    public static String prompt_Email() {

        Scanner input = new Scanner(System.in);
        System.out.println("Email:");
        String em = input.next();
        return em;

    }
}
