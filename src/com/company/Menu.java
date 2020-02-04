/** This Menu class runs the functions for the main program.
 *  It contains prompts from EX1 and initAddressBookExercise from EX2.
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.1
 */
package com.company;

public class Menu {

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_FirstName() {

        System.out.println("First Name:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_LastName() {

        System.out.println("Last Name:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_Street() {

        System.out.println("Street:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_City() {

        System.out.println("City:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_State() {

        System.out.println("State:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_Zip() {

        System.out.println("Zip:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_Telephone() {

        System.out.println("Telephone:");

    }

    /** Print prompt for user input
     *  Further Functionality to be implemented
     *  @returns nothing
     */
    public static void prompt_Email() {

        System.out.println("Email:");

    }

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
}
