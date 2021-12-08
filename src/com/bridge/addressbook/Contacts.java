package com.bridge.addressbook;

import java.util.*;

public class Contacts {
    public static void main(String[] args) {

        List<AddressBook> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("To enter a record press 1 \nTo display records press 2\n" +
                "To Update a record press 3\n" + "To delete a record press 4\n "+
                " 0 to exit");
        ch = c.nextInt();
        while (ch != 0) {
            switch (ch) {

                case 1:
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
                    break;
                case 2:
                    System.out.println(" Contacts ");
                    Iterator<AddressBook> i = a.iterator();
                    while (i.hasNext()) {
                        AddressBook add = i.next();
                        System.out.println(add);
                    }
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("Enter first name of contact to update ");
                    fname = sc.nextLine();

                    ListIterator<AddressBook> li = a.listIterator();
                    while (li.hasNext()) {
                        AddressBook add = li.next();
                        if (add.getfName().equals(fname)) {
                            System.out.println("Enter the new contact details");
                            System.out.println("Enter Fname - ");
                            String newFname = sc.nextLine();
                            System.out.println("Enter lname - ");
                            String newLname = sc.nextLine();
                            System.out.println("Enter address - ");
                            String newAddress = sc.nextLine();
                            System.out.println("Enter city - ");
                            String newCity = sc.nextLine();
                            System.out.println("Enter state - ");
                            String newState = sc.nextLine();
                            System.out.println("Enter email - ");
                            String newEmail = sc.nextLine();
                            System.out.println("Enter number - ");
                            String newNumber = sc.nextLine();
                            System.out.println("Enter zip - ");
                            String newzip = sc.nextLine();
                            li.set(new AddressBook(newFname, newLname, newAddress, newCity, newState, newEmail, newNumber, newzip));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("Record Updated successfully");
                    }
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter fname to delete ");
                    fname = sc.nextLine();
                    System.out.println(" Contacts ");
                    i = a.iterator();
                    while (i.hasNext()) {
                        AddressBook add = i.next();
                        if (add.getfName().equals(fname)) {
                            i.remove();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("Record deleted successfully");
                    }
                    break;
            }

            System.out.println("To enter a record press 1 \nTo display records press 2\n" +
                    "To Update a record press 3\n" + "To delete a record press 4\n "+
                    " 0 to exit");
            ch = c.nextInt();
        }

    }
}
