/*
Dylan Torres
10/28/2024
Assignment 2:
Phone Book
Purpose:
The purpsoe of this pogram is to build
the logic for the test class to run inside
the case statement. The case statement will 
act as  menu, with options that will call 
methods from this class to perform user
chosen functions. This will contain the following methods:
-addEntry
-deleteEntry
-modifyEntry
-printEntries
 */

import java.util.Scanner;

public class DTPhoneBook {

    public static void introduction() { //introduce the program
        
        System.out.println("Welcome to phone book");
        System.out.println("This program will act as a page full of contacts, followed by:");
        System.out.println("-Names");
        System.out.println("-Phone numbers");
        System.out.println("-Address");
        System.out.println("You will also be able to write yourself in, and out");
        

    }// end of intro

    public static void main(String[] args) { 

        BookManager manager = new BookManager();
        Scanner scn = new Scanner(System.in);     
        String selection;

        do {

            System.out.println("\nPhonebook Manager");
            System.out.println("1. Add Entry");
            System.out.println("2. Modify Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. Print Entries");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
                  
           
                selection = scn.nextLine(); //take in user input as selection

                //my prefered way of creating menus in java 
                switch (selection) {

                    case "1": //add entry 
                    manager.addEntry();
                        break;
                    case "2": //modify entry
                    manager.modifyEntry();
                        break;
                    case "3": // delete entry
                    manager.deleteEntry();
                        break;
                    case "4": // print entry
                    manager.printEntries();
                        break;
                    case "5": // exit program
                    System.out.println("Exiting...");
                        return;
                    default: 
                    System.out.println("Invalid choice. Please try again.");
                        break;

                }//end switch
                
        } while (!selection.equals("exit"));
    }//end of menu        

}//end of class DTPhoneBook
