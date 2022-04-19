package edu.curtin.addressbook.view;

import java.util.*;
import edu.curtin.addressbook.controller.*;
import edu.curtin.addressbook.model.*;

public class AddressBookAppView {

    /** Used to obtain user input. */
    private static Scanner input = new Scanner(System.in);

    /**
     * Show the main menu, offering the user options to (1) search entries by 
     * name, (2) search entries by email, or (3) quit.
     *
     * @param addressBook The AddressBook object to search.
     */
    public static void showMenu(AddressBook addressBook)
    {
        boolean done = false;
        while(!done)
        {
            int option;
            System.out.println("(1) Search by name, (2) Search by email, (3) Quit");
            
            try
            {
                switch(Integer.parseInt(input.nextLine()))
                {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = input.nextLine();
                        
                        // FIXME: Insert your code here to find an entry by name and display it.
                        System.out.println(addressBook.getNEntry(name));
                        break;
                        
                    case 2:
                        System.out.print("Enter email address: ");
                        String email = input.nextLine();
                        
                        // FIXME: Insert your code here to find an entry by email and display it.
                        System.out.println(addressBook.getAEntry(email));
                        break;
                        
                    case 3:
                        done = true;
                        break;
                        
                    default:
                        System.out.println("Enter a valid number");
                        break;
                }
            }
            catch(NumberFormatException e)
            {
                // The user entered something non-numerical.
                System.out.println("Enter a number");
            }
        }
    }
}
