package com.bridge.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    public static ArrayList<Operations> contactBookOptions() {

        Operations oprations = new Operations();

        ArrayList<Operations> operations = new ArrayList<>();
        String name;
        Scanner sc = new Scanner(System.in);
        int ch = 1;


        while (ch != 0) {
            System.out.print(" To Add contact enter 1 \nTo Edit contact enter 2 \nTo Delete contact enter 1 \nTo display contact enter 4");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Operations operations1 = Operations.read(operations);
                    if (operations1.fName != null) {
                        operations.add(operations1);
                    }
                    break;
                case 2:
                    System.out.println("Enter first name that you want to edit contactDetails");
                    name = sc.next();
                    oprations.updateData(name, operations);
                    break;
                case 3:
                    System.out.println("Enter the first name that you want to delete Contact details ");
                    name = sc.next();
                    oprations.deleteRecord(name, operations);
                    break;
                case 4:
                    System.out.println("contactDetails : " + operations.size());
                    oprations.addressBook(operations);
                    break;
                default:
                    System.out.println("Enter correct option");
                    break;

            }
        }
        return operations;
    }
}
