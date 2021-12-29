package com.bridge.addressbook;

import java.util.*;

public class Operations {
    String fName, lName, city, state, address, email, phoneNo, zip;

    public static void book(ArrayList<Operations> contactPerson) {
        int count = 1;
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

    public static void update(String name, ArrayList<Operations> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if (name.equals(contactDetails.get(i).fName)) {
                contactDetails.remove(i);
                contactDetails.add(i, read());
            }
        }
        System.out.println("Record Update Successfully");
    }

//To read the data from console
    public static Operations read() {

        Operations contactPersonDetails = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name : ");
        contactPersonDetails.fName = sc.next();

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

//To delete the entered contact
    public static void delete(String name, ArrayList<Operations> contactDetails) {
        if (contactDetails.size() > 0) {
            for (int i = 0; i < contactDetails.size(); i++) {
                if (name.equals(contactDetails.get(i).fName)) {
                    contactDetails.remove(i);
                } else System.out.println("There is no contact named" + name);
            }
        } else System.out.println("There is no address to delete");
        System.out.println("Record Delete Successfully");
    }

//To search contact using city name
    public static void search(String city, Map<String, ArrayList<Operations>> map) {
        map
                .values()
                .stream().
                forEach(value -> {
                    value.stream()
                            .forEach(person -> {
                                if (person.city.contains(city) || person.state.contains(city))
                                    System.out.println(person);
                            });
                });
    }

    @Override
    public String toString() {
        return "Operations{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}