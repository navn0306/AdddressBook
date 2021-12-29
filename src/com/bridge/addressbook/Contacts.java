package com.bridge.addressbook;

import java.util.*;

public class Contacts {

    public static ArrayList<Operations> addressBook() {
        ArrayList<Operations> contact = new ArrayList<>();
        Operations operations = new Operations();
        String name;
        Scanner sc = new Scanner(System.in);
       int ch = 1;
        while (ch != 0) {
            System.out.print(" To Add contact enter 1 \nTo Edit contact enter 2 \nTo Delete contact enter 1 " +
                    "\nTo display contact enter 4\nTo exit enter 0");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Operations operations1 = operations.read();
                    if (contact != null) {
                        contact.add(operations1);
                    }
                    break;
                case 2:
                    System.out.println("Enter first name that you want to edit contactDetails");
                    name = sc.next();
                    Operations.update(name, contact);
                    break;
                case 3:
                    System.out.println("Enter the first name that you want to delete Contact details ");
                    name = sc.next();
                    Operations.delete(name, contact);
                    break;
                case 4:
                    System.out.println("ContactDetails: " + contact.size());
                    Operations.book(contact);
                    break;

                case 0:
                    break;
            }
        }
        return contact;
    }
}