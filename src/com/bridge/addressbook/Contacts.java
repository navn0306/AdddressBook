package com.bridge.addressbook;

import java.util.*;

public class Contacts {
    public static void main(String[] args) {

        Collection<AddressBook> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("To enter a record press 1 or 0 to exit");
        ch = c.nextInt();
        while (ch != 0) {

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
            System.out.println("To enter a record press 1or 0 to exit");
            ch = c.nextInt();
        }
        System.out.println(" Contacts ");
        Iterator<AddressBook> i =a.iterator();
        while (i.hasNext()){
            AddressBook address = i.next();
            System.out.println(address);
        }
    }
}