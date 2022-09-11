package com.addressbooksystem;

import java.util.ArrayList;

public class AddressBook {
	public ArrayList<ContactPerson> contactPerson = new ArrayList<ContactPerson>();
	
	public void addContact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
		contactPerson.add(new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email));
	}
	
	public void showContacts() {
		contactPerson.forEach((contact) -> {
			System.out.println("");
			System.out.println(contact.firstName+" "+contact.lastName+" : ");
			System.out.println(contact.address+", ");
			System.out.println(contact.city+", "+contact.state+" - "+contact.zip);
			System.out.println(contact.phoneNumber);
			System.out.println(contact.email);
			System.out.println("");
		});
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact("fname", "Lname", "Pune", "Pune", "Maharashtra", "411111", "+91 9999999999", "address@book.com");
		addressBook.showContacts();
	}

}
