/** This Menu class runs the functions for the main program.
 *  It contains prompts from EX1 and initAddressBookExercise from EX2.
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */
package com.company;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
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
                load();
                break;
            case 2:
                add();
                break;
            case 3:
                remove();
                break;
            case 4:
                find();
                break;
            case 5:
                list();
                break;
            default:
                quit();
        }
    }

    public static void load() {}

    public static void add() {}

    public static void remove() {}

    public static void find() {}

    public static void list() {

    }

    public static void quit() {
        System.exit(0);
    }

    /** Print prompt for user input
     *  @returns String fn First_Name
     */
    public static String prompt_FirstName() {

        Scanner input = new Scanner(System.in);
        System.out.println("First Name:");
        String fn = input.next();
        return fn;

    }

    /** Print prompt for user input
     *  @returns String ln Last_Name
     */
    public static String prompt_LastName() {

        Scanner input = new Scanner(System.in);
        System.out.println("Last Name:");
        String ln = input.next();
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
