/** This AddressEntry is a class for creating objects to store user data in an Address_Book
 *  It contains variables for each element in an Address_Entry and methods for setting and getting those elements
 * @author John Berge
 * @since Jan. 23, 2020
 * @version 1.2
 */

package com.company;

public class AddressEntry {

    /** Entry First_Name represented by a String
     */
    String firstName;
    /** Entry Last_Name represented by a String
     */
    String lastName;
    /** Entry Street_Address represented by a String
     */
    String street;
    /** Entry City represented by a String
     */
    String city;
    /** Entry State represented by a String
     */
    String state;
    /** Entry ZIP_Code represented by an integer
     */
    int zip;
    /** Entry Phone_Number represented by a String to account for numbers and special characters
     */
    String phone;
    /** Entry Email_Address represented by a String
     */
    String email;

    /** Default constructor for Address_Entry object filling in each variable with empty data
     * @returns nothing
     */
    public AddressEntry() {
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.phone = "";
        this.email = "";
    }

    /** Parameterized constructor for Address_Entry object creating an entry with data included
     * @param String firstName Entry First_Name represented by a String
     * @param String lastName Entry Last_Name represented by a String
     * @param String street Entry Street_Address represented by a String
     * @param String city Entry City represented by a String
     * @param String state Entry State represented by a String
     * @param int zip Entry ZIP_Code represented by an Integer
     * @param String phone Entry Phone_Number represented by a String
     * @param String email Entry Email represented by a String
     * @returns nothing
     */
    AddressEntry(String firstName,String lastName,String street,String city,String state,int zip,String phone,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /** Converts variable information to a single string for output
     * @returns String of all the variables plus formatting
     */
    public String toString() {
        return lastName + ", " + firstName + "\n" + street + "\n" + city + ", " + state + " " + zip + "\n" + phone + "\n" + email + "\n";
    }

    /** Sets private class variables to given parameter
     * @param String firstName Entry First_Name represented by a String
     * @returns nothing
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** gets private class variable from class object
     * @returns firstName string from Address_Entry
     */
    public String getFirstName() {
        return firstName;
    }

    /** Sets private class variables to given parameter
     * @param String lastName Entry Last_Name represented by a String
     * @returns nothing
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** gets private class variable from class object
     * @returns lastName string from Address_Entry
     */
    public String getLastName() {
        return lastName;
    }

    /** Sets private class variables to given parameter
     * @param String street Entry Street_Address represented by a String
     * @returns nothing
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /** gets private class variable from class object
     * @returns street string from Address_Entry
     */
    public String getStreet() {
        return street;
    }

    /** Sets private class variables to given parameter
     * @param String city Entry City represented by a String
     * @returns nothing
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** gets private class variable from class object
     * @returns city string from Address_Entry
     */
    public String getCity() {
        return city;
    }

    /** Sets private class variables to given parameter
     * @param String state Entry State represented by a String
     * @returns nothing
     */
    public void setState(String state) {
        this.state = state;
    }

    /** gets private class variable from class object
     * @returns state string from Address_Entry
     */
    public String getState() {
        return state;
    }

    /** Sets private class variables to given parameter
     * @param int zip Entry ZIP_Code represented by an Integer
     * @returns nothing
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /** gets private class variable from class object
     * @returns zip integer from Address_Entry
     */
    public int getZip() {
        return zip;
    }

    /** Sets private class variables to given parameter
     * @param String phone Entry Phone_Number represented by a String
     * @returns nothing
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** gets private class variable from class object
     * @returns phone string from Address_Entry
     */
    public String getPhone() {
        return phone;
    }

    /** Sets private class variables to given parameter
     * @param String email Entry Email represented by a String
     * @returns nothing
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** gets private class variable from class object
     * @returns email string from Address_Entry
     */
    public String getEmail() {
        return email;
    }
}
