package com.bridge.addressbook;

import java.util.*;

public class Operations {
    String fName, lName, city, state, address, email, phoneNo, zip;
    int count = 1;

    public void Operations() {
    }

    public void addressBook(ArrayList<Operations> contactPerson) {
        for (int i = 0; i < contactPerson.size(); i++) {
            System.out.println("contact" + count);
            System.out.println("First Name: " + contactPerson.get(i).fName);
            System.out.println("Last Name: " + contactPerson.get(i).lName);
            System.out.println("Address: " + contactPerson.get(i).address);
            System.out.println("City Name : " + contactPerson.get(i).city);
            System.out.println("State Name : " + contactPerson.get(i).state);
            System.out.println("Email-Id : " + contactPerson.get(i).email);
            System.out.println("Zip Code : " + contactPerson.get(i).zip);
            System.out.println("phone Number Name : " + contactPerson.get(i).phoneNo);
            count++;
        }
    }

    public void updateData(String name, ArrayList<Operations> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if (name.equals(contactDetails.get(i).fName)) {
                contactDetails.remove(i);
                contactDetails.add(i, read(contactDetails));
            }
        }
        System.out.println("Record Update Successfully");
    }

    public static Operations read(ArrayList<Operations> operations) {

        Operations contactPersonDetails = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name : ");
        contactPersonDetails.fName = sc.next();
        if (operations.stream().filter(name -> name.fName.equals(contactPersonDetails.fName)).count() > 0) {
            System.out.println("Contact already exists");
            return new Operations();
        }
        System.out.print("Last Name : ");
        contactPersonDetails.lName = sc.next();

        System.out.print("Address: ");
        contactPersonDetails.address = sc.next();

        System.out.print("City Name : ");
        contactPersonDetails.city = sc.next();

        System.out.print("Email : ");
        contactPersonDetails.email = sc.next();

        System.out.print("Zip Code : ");
        contactPersonDetails.zip = sc.next();

        System.out.print("Phone Number: ");
        contactPersonDetails.phoneNo = sc.next();
        return contactPersonDetails;
    }

    public void deleteRecord(String name, ArrayList<Operations> contactDetails) {
        if (contactDetails.size() > 0) {
            for (int i = 0; i < contactDetails.size(); i++) {
                if (name.equals(contactDetails.get(i).fName)) {
                    contactDetails.remove(i);
                } else System.out.println("There is no contact named" + name);
            }
        } else System.out.println("There is no address to delete");
        System.out.println("Record Delete Successfully");
    }

}