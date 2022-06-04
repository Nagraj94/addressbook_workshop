package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);

    ArrayList<Contact> list = new ArrayList();


    public void addNewContact(){
        System.out.println("enter your firstname");
        String firstname =sc.next();
        System.out.println("enter your lastname");
        String lastname = sc.next();
        System.out.println("enter your email address");
        String email = sc.next();
        System.out.println("enter your address");
        String address = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        System.out.println("enter state");
        String state = sc.next();
        System.out.println("enter zip");
        long zip = sc.nextLong();
        System.out.println("enter phone number");
        long number = sc.nextLong();

        Contact contact = new Contact(firstname,lastname,email,address,city,state,zip,number);
        list.add(contact);

    }
    public void editContact(){
        System.out.println("enter your firstname");
        String firstname = sc.next();
        System.out.println("enter your lastname");
        String lastname = sc.next();

        for (Contact contact:list){
            if(contact.getFirstname().equals(firstname) && contact.getLastname().equals(lastname)){
                contact.editExistingContact();
            }
        }
    }

    public void deleteContact(){

        System.out.println("enter your firstname");
        String firstname = sc.next();
        System.out.println("enter your lastname");
        String lastname = sc.next();

        for (Contact contact:list){
            if(contact.getFirstname().equals(firstname) && contact.getLastname().equals(lastname)){
                list.remove(contact);

            }
            }


    }

}
