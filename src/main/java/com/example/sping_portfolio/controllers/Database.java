package com.example.sping_portfolio.controllers;


import java.io.*;


public class Database {
    public static UserDatabase udb = new UserDatabase();


    public static void writeFile() {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(udb);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in user.ser\n");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    public static void readFile() {
        try {
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            udb = (UserDatabase) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("User class not found");
            c.printStackTrace();
            return;
        }
    }

    public static void listUsers() {
        //Enumeration<Integer> elems = ((ConcurrentHashMap) udb.userlist).elements();

        for(String key: udb.userlist.keySet()) {
            User ne = udb.userlist.get(key);
            System.out.println("Name: " + ne.firstname + " " + ne.lastname);
            System.out.println("Address: " + ne.streetaddress + " , " + ne.city + " , " + ne.state + " , " + ne.country);
            System.out.println("Age: " + ne.age);
        }

    }

    public static void main(String [] args) {

        readFile();

        listUsers();

        if(! udb.createUser("cduroiu", "Christopher", "Duroiu", "16564 Mobileton St", "San Diego", "California", "USA", 17)) {
            System.out.println("User cannot be added");
        } else {
            writeFile();
        }

        if(! udb.createUser("aligator", "Ali", "Gator", "65 Saturn St", "San Diego", "California", "USA", 21)) {
            System.out.println("User cannot be added");
        } else {
            writeFile();
        }

        if(! udb.createUser("hello23", "Herman", "Steele", "5774 Superstar Ln", "San Diego", "California", "USA", 25)) {
            System.out.println("User cannot be added");
        } else {
            writeFile();
        }

    }

}

