package com.bridge.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Map<String, ArrayList<Contacts>> hashMap = new HashMap();
        ArrayList arrayList;
        Scanner sc = new Scanner(System.in);
        String addressbook;
        int ch = 1;

        while (ch != 0) {
            System.out.println("To Add AddressBook enter 1\nTo Edit AddressBook enter 2\nTo Delete AddressBook enter 3" +
                    "\nTo Display AddressBook enter 4");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the Address book Name");
                    addressbook = sc.next();

                    hashMap.put(addressbook, null);
                    break;
                case 2:
                    System.out.println("Enter Address book Name for Edit");
                    addressbook = sc.next();
                    arrayList = Contacts.contactBookOptions();
                    ArrayList temp = hashMap.get(addressbook);
                    if (temp != null) {
                        arrayList.add(temp);

                    }
                    hashMap.put(addressbook, arrayList);
                    break;
                case 3:
                    System.out.println("Enter Address book Name for Delete...");
                    addressbook = sc.next();
                    if (hashMap.containsKey(addressbook)) {
                        hashMap.remove(addressbook);
                    } else {
                        System.out.println("No such Book Found, Please enter a Valid AddressBook name");
                    }
                    break;
                case 4:
                    System.out.println("Address Bool List");

                    for (String name : hashMap.keySet()) {
                        String value = hashMap.get(name).toString();
                        System.out.println(name + " --> " + value);
                    }
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}

