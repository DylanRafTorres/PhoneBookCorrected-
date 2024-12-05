/* 
The purpsoe of this class is to create the methods that will be called into 
my test method that uses a menu to allow the user to call different methods
 */

import java.util.LinkedList;
import java.util.Scanner;

public class BookManager {

        Scanner scn = new Scanner(System.in);
        LinkedList <PhonebookNode> bellinghamers;
        LinkedList <PhonebookNode> Seattlers;
    
    public BookManager() {

        bellinghamers = new LinkedList<>();
        Seattlers = new LinkedList<>(); 

    }//end bookManager

    public void addEntry(){ //add entries 

        System.out.println("Enter name:");
        String name = scn.nextLine();
        System.out.println("Enter address:");
        String address = scn.nextLine();
        System.out.println("Enter city:");
        String city = scn.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scn.nextLine();

        bellinghamers.add(new PhonebookNode(name, address, city, phoneNumber));
        System.out.printf("\n\nEntry added.\n");

    }//end addEntry

    public void deleteEntry() { //delete entries only if already made
        if (bellinghamers.isEmpty()) { //fill check
            System.out.printf("\n\nYou haven't created any entries\n");
        }//end if 
        else {
            System.out.println("Enter the name of the entry you wish to delete:");
            System.out.println();
            String name = scn.nextLine(); 

            for (PhonebookNode PhonebookNode : bellinghamers) {

                if (PhonebookNode.getName().equalsIgnoreCase(name)) {
                    bellinghamers.remove(PhonebookNode);
                    System.err.println("Entry deleted");
                        return;
                }//end if 
                else {
                    System.out.println("Entry not found");
                }//end else

            }//end for    

        }//end else
        
    }//end deleteEntry 

    public void modifyEntry(){ //modify the entries stored

        if (bellinghamers.isEmpty()) { //fill check
            System.out.printf("\n\nYou haven't created any entries\n");
        }//end if 
        else {
            System.out.println("type the name of the entry you would like to modify");
            System.out.println();
            String name = scn.nextLine();

            for (PhonebookNode PhonebookNode : bellinghamers) {

                if (PhonebookNode.getName().equalsIgnoreCase(name)) {
                    System.out.println("Enter new address:");
                    String address = scn.nextLine();
                    System.out.println("Enter new city:");
                    String city = scn.nextLine();
                    System.out.println("Enter new phone number:");
                    String phoneNumber = scn.nextLine();
                    //update
                    bellinghamers.add(new PhonebookNode(name, address, city, phoneNumber));
                    System.out.println("Entry modified.");

                }//end if 
                System.out.println("Entry not found.");

            }//end for 

        }//end else    

    }//end modifyEntry

    public void printEntries(){

        if (bellinghamers.isEmpty()) {
            System.out.printf("\n\nYou haven't created any entries\n");
        }//end if 
        else {

            System.out.printf("\n\nPhone Book:\n");
            for (PhonebookNode phonebookNode : bellinghamers) {
                System.out.println(phonebookNode);

            }//end for 

        }//end else

    }//end printEntries
    
}//end bookManager








    
   
