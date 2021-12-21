package com.bridge.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Map<String, ArrayList<Contacts>> addressHashMap = new HashMap();
        ArrayList arrayList;
        Scanner sc = new Scanner(System.in);
        String bookName;
        int ch =1;

        while (flag) {
            System.out.println("--------------------------------------------");
            System.out.println("To Add AddressBook enter 1\nTo Edit AddressBook enter 2\nTo Delete AddressBook enter 3\nTo Display AddressBook enter 4" +
                    "\nTo Exit enter 0");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the Address book Name");
                    bookName = sc.next();
                    addressHashMap.put(bookName, null);
                    break;
                case 2:
                    System.out.println("Enter Address book Name for Edit");
                    bookName = sc.next();
                    arrayList = Contacts.contactBookOptions();
                    ArrayList temp = addressHashMap.get(bookName);
                    if (temp != null) {
                        arrayList.add(temp);

                    }
                    addressHashMap.put(bookName, arrayList);
                    break;
                case 3:
                    System.out.println("Enter Address book Name for Delete...");
                    bookName = sc.next();
                    if (addressHashMap.containsKey(bookName)) {
                        addressHashMap.remove(bookName);
                    } else {
                        System.out.println("No such Book Found, Please enter a Valid AddressBook name");
                    }
                    break;
                case 4:
                    System.out.println("Address Bool List");

                    for (String name : addressHashMap.keySet()) {
                        String value = addressHashMap.get(name).toString();
                        System.out.println(name + " --> " + value);
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}

