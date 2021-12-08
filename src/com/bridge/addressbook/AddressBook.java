package com.bridge.addressbook;

public class AddressBook {
    private String fName, lName, address, city, state, email, phoneNum, zipCode;

    AddressBook(String fName, String lName, String address, String city, String state, String email, String phoneNum, String zipCode) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNum = phoneNum;
        this.zipCode = zipCode;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

