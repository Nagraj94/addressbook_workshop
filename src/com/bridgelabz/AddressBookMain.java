package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook address = new AddressBook();
        address.addNewContact();
        System.out.println("add another contact details");
        address.addNewContact();
        System.out.println(address.list);

        System.out.println("edit contact");
        address.editContact();
        System.out.println(address.list);
    }
}
