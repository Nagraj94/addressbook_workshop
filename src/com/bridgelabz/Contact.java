package com.bridgelabz;

import java.util.Scanner;

public class Contact {

    static Scanner sc = new Scanner(System.in);

    String firstname;
    String lastname;
    String email;
    String address;
    String city;
    String state;
    long zip;
    long number;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", number=" + number +
                '}';
    }

    public Contact(String firstname, String lastname, String email, String address, String city, String state, long zip, long number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }


    public void editExistingContact() {

        System.out.println("enter your firstname");
        firstname = sc.next();
        System.out.println("enter your lastname");
        lastname = sc.next();
        System.out.println("enter your email address");
        email = sc.next();
        System.out.println("enter your address");
        address = sc.next();
        System.out.println("enter your city");
        city = sc.next();
        System.out.println("enter your zip code");
        zip = sc.nextLong();
        System.out.println("enter your number");
        number = sc.nextLong();
    }


}
