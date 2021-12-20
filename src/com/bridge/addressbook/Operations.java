package com.bridge.addressbook;

import java.util.*;

public class Operations {
    String firstName, lastName, city, state, address, emailId;
    long phoneNo;
    int zipCode;
    int count = 1;

    public void Operations() {
    }

    public void addressBook(ArrayList<Operations> contactPerson) {
        for (int i = 0; i < contactPerson.size(); i++) {
            System.out.println("contact" + count);
            System.out.println("First Name: " + contactPerson.get(i).firstName);
            System.out.println("Last Name: " + contactPerson.get(i).lastName);
            System.out.println("Address: " + contactPerson.get(i).address);
            System.out.println("City Name : " + contactPerson.get(i).city);
            System.out.println("State Name : " + contactPerson.get(i).state);
            System.out.println("Email-Id : " + contactPerson.get(i).emailId);
            System.out.println("Zip Code : " + contactPerson.get(i).zipCode);
            System.out.println("phone Number Name : " + contactPerson.get(i).phoneNo);
            count++;
        }
    }

    public void updateData(String name, ArrayList<Operations> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if (name.equals(contactDetails.get(i).firstName)) {
                contactDetails.remove(i);
                contactDetails.add(i, getInput());
            }
        }
        System.out.println("Record Update Successfully");
    }

    public static Operations getInput() {
        Operations contactPersonDetails = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name : ");
        contactPersonDetails.firstName = sc.next();

        System.out.print("Last Name : ");
        contactPersonDetails.lastName = sc.next();

        System.out.print("Address: ");
        contactPersonDetails.address = sc.next();

        System.out.print("City Name : ");
        contactPersonDetails.city = sc.next();

        System.out.print("Name : ");
        contactPersonDetails.state = sc.next();

        System.out.print("Email : ");
        contactPersonDetails.emailId = sc.next();

        System.out.print("Zip Code : ");
        contactPersonDetails.zipCode = sc.nextInt();

        System.out.print("Phone Number: ");
        contactPersonDetails.phoneNo = sc.nextInt();
        return contactPersonDetails;
    }

    public void deleteRecord(String name, ArrayList<Operations> contactDetails) {
        if (contactDetails.size() > 0) {
            for (int i = 0; i < contactDetails.size(); i++) {
                if (name.equals(contactDetails.get(i).firstName)) {
                    contactDetails.remove(i);
                } else System.out.println("There is no contact named" + name);
            }
        } else System.out.println("There is no address to delete");
        System.out.println("Record Delete Successfully");
    }

    public void getAddressbook(Map<String, Operations> addressBookHashMap) {
        for (String addressbook : addressBookHashMap.keySet()) {
            System.out.println("Person contact for the " + addressbook + " is " + addressBookHashMap.get(addressbook).toString());
        }
    }
}