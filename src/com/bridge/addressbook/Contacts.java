package com.bridge.addressbook;

import java.util.*;

public class Contacts {
    public static void main(String[] args) {

        Collection<AddressBook> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fname - ");
        String fname = sc.nextLine();
        System.out.println("Enter lname - ");
        String lname = sc.nextLine();
        System.out.println("Enter address - ");
        String address = sc.nextLine();
        System.out.println("Enter city - ");
        String city = sc.nextLine();
        System.out.println("Enter state - ");
        String state = sc.nextLine();
        System.out.println("Enter email - ");
        String email = sc.nextLine();
        System.out.println("Enter number - ");
        String number = sc.nextLine();
        System.out.println("Enter zip - ");
        String zip = sc.nextLine();

        a.add(new AddressBook(fname, lname, address, city, state, email, number, zip));
        System.out.println(" Details ");
        System.out.println(a);

    }
}
