package com.example.sping_portfolio.controllers;

import java.io.*;
import java.util.List;



public class FeedbackDatabaseWrapper {
    public FeedbackDatabase udb = new FeedbackDatabase();

    public FeedbackDatabaseWrapper() {
        if(udb.feedbacklist.isEmpty()) {
            readFile();
        }
    }

    public void writeFile() {
        try {
//            List<Feedback> l2;
//            for(int i = feedbacklist.size()-1; i<=0; i--){
//                l2.add(feedbacklist.get(i));;
//            }

            FileOutputStream fileOut =
                    new FileOutputStream("database/feedback.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(udb);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in feedback.ser\n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void readFile() {
        File f = new File("database/feedback.ser");

        if (f.exists()) {
            try {
                FileInputStream fileIn = new FileInputStream("database/feedback.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                udb = (FeedbackDatabase) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
                return;
            } catch (ClassNotFoundException c) {
                System.out.println("Feedback class not found");
                c.printStackTrace();
                return;
            }
        }
    }


}
