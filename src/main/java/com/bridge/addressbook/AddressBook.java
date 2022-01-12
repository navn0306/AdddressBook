package com.bridge.addressbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static com.bridge.addressbook.Operations.cityStateWiseData;

public class AddressBook {
    private static final String PATH = "C:\\Users\\Navneet\\Documents\\OOPs\\AddressBook\\src\\main\\resources";

    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<Operations>> hashMap = new HashMap();
        ArrayList arrayList;
        Scanner sc = new Scanner(System.in);
        String addressbook;
        int ch = 1;


        while (ch != 0) {
            System.out.println("To Add AddressBook enter 1\nTo Edit AddressBook enter 2\nTo Delete AddressBook enter 3" +
                    "\nTo Display AddressBook enter 4\nTo Search enter 5\nTo get City wise data\n6 - State wise data " +
                    "\nTo find the count of Contacts enter 7\nTo sort a addressBook enter 8\nTo sort the addressbook by city,state or zip enter 9");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the Address book Name");
                    addressbook = sc.next();
                    hashMap = new HashMap<>();
                    break;
                case 2:
                    System.out.println("Enter Address book Name for Edit");
                    addressbook = sc.next();
                    arrayList = Contacts.addressBook();
                    ArrayList temp = hashMap.get(addressbook);
                    if (temp != null) {
                        arrayList.add(temp);
                    }
                    Path fileName = Paths.get(PATH + "/" + addressbook + ".txt");
                    System.out.println(fileName);
                    if (Files.notExists(fileName)) {
                        Files.createFile(fileName);
                        List<String> list = Arrays.asList(arrayList.toString());
                        Files.write(fileName, list, StandardOpenOption.APPEND);
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
                    System.out.println("Address List");
                    for (String name : hashMap.keySet()) {
                        String value = hashMap.get(name).toString();
                        System.out.println(name + " --> " + value);
                    }
                    break;
                case 5:
                    System.out.print("Enter city name : ");
                    Operations.search((new Scanner(System.in).next()), hashMap);
                    break;

                case 6:
                    System.out.print("Enter City or State name : ");
                    Map<String, Operations> cityStateMap = cityStateWiseData((new Scanner(System.in).next()), hashMap);
                    for (String cityCount : cityStateMap.keySet()) {
                        System.out.println(cityCount + " - " + cityStateMap.get(cityCount));
                    }
                    break;
                case 7:
                    System.out.print("Enter City or State name : ");
                    Operations numberOfContact = new Operations((new Scanner(System.in).next()), hashMap);
                    System.out.println("Total number of contact in given City is : " + numberOfContact);
                    break;
                case 8:
                    System.out.println("Enter the Book Name ; ");
                    String book = sc.next();
                    Operations sort = new Operations((new Scanner(System.in).next()), hashMap);
                    List<Operations> contacts = hashMap.get(book);
                    sort.sortContacts(contacts);
                    break;
                case 9:
                    System.out.println("Enter the Book Name : ");
                    String bookName = sc.next();
                    List<Operations> contact = hashMap.get(bookName);
                    Operations sortContacts = new Operations();
                    System.out.println("1- City \n2- Sate \n3- Zip");
                    sortContacts.sortAddressBookCityStateZip(new Scanner(System.in).nextInt(), contact);
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}

