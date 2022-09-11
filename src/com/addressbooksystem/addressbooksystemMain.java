package com.addressbooksystem;
import java.util.Scanner;

public class addressbooksystemMain {
	public static void main(String[] args) {
	String firstName, lastName, address, city, state, zip, phoneNumber, eamil;
	Scanner scanner = new Scanner(System.in);
	AddressBook addressBook = new AddressBook();
	System.out.println("Enter person details: ");
	for (int number = 1; number <= 3; number++) {
		System.out.println("");
		System.out.println("Person "+number+" : ");
		System.out.print("First Name : ");
		firstName = scanner.nextLine();
		System.out.print("Last Name : ");
		lastName = scanner.nextLine();
		System.out.print("Address : ");
		address = scanner.nextLine();
		System.out.print("City : ");
		city = scanner.nextLine();
		System.out.print("State : ");
		state = scanner.nextLine();
		System.out.print("Zip : ");
		zip = scanner.nextLine();
		System.out.print("Phone Number : ");
		phoneNumber = scanner.nextLine();
		System.out.print("Email : ");
		eamil = scanner.nextLine();
		addressBook.addContact(firstName, lastName, address, city, state, zip, phoneNumber, eamil);	
	}
	addressBook.showContacts();
	scanner.close();
}
}
