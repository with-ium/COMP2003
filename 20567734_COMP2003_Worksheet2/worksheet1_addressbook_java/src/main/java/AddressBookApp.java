package edu.curtin.addressbook;

import java.io.*;
import java.util.*;

/**
 * A simple address book application.
 * @author Dave and ...
 */
public class AddressBookApp 
{
    /** Used to obtain user input. */
    private Scanner input = new Scanner(System.in);

    private HashMap<Integer, Option> optionList;
    private AddressBook addressBook;

    public AddressBookApp() {
        bookSetup();
    }
    
    public static void main(String[] args)
    {
        AddressBookApp bookApp = new AddressBookApp();
    }

    /**
     * Setup an address book object and run the user program.
     *
     * @throws IOException If the file cannot be read.
     */
    private void bookSetup() {
        String fileName;
        optionList = new HashMap<Integer, Option>(); //initialise option container

        System.out.print("Enter address book filename: ");
        fileName = input.nextLine();

        try
        {
            addressBook = readAddressBook(fileName);
            SearchByName byName = new SearchByName(addressBook); 
            SearchByEmail byEmail = new SearchByEmail(addressBook);
            DisplayEntries displayEnt = new DisplayEntries(addressBook, false);
            optionList.put(1, byName);
            optionList.put(2, byEmail);
            if (displayEnt.requiresText()) {
                showMenu(addressBook);
            } else {
                displayEnt.displayAll();
            }
        }
        catch(IOException e)
        {
            System.out.println("Could not read from " + fileName + ": " + e.getMessage());
        }   
    }
    
    private void addOption() {
        
    }
    
    /**
     * Read the address book file, containing all the names and email addresses.
     *
     * @param fileName The name of the address book file.
     * @return A new AddressBook object containing all the information.
     * @throws IOException If the file cannot be read.
     */
    private AddressBook readAddressBook(String fileName) throws IOException
    {
        AddressBook addressBook = new AddressBook();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line = reader.readLine();
            while(line != null)
            {
                String[] parts = line.split(":");
                                
                // FIXME: Insert your code here to add a new address book entry.
                // Note: 
                // parts[0] contains the person's name.
                // parts[1], parts[2], etc. contain the person's email address(es).

                Entry curEntry = new Entry(parts[0]);
                for (int i = 1; i < parts.length; i++) {
                    addressBook.addAEntry(parts[i], curEntry.getName());
                    curEntry.addAddress(parts[i]);
                }

                addressBook.addNEntry(curEntry.getName(), curEntry);
                line = reader.readLine();
            }
        }
        
        return addressBook;
    }
    
    /**
     * Show the main menu, offering the user options to (1) search entries by 
     * name, (2) search entries by email, or (3) quit.
     *
     * @param addressBook The AddressBook object to search.
     */
    private void showMenu(AddressBook addressBook)
    {
        boolean done = false;
        while(!done)
        {
            String option;
            System.out.println("Enter a number: \n(1) Search by name \n(2) Search by email \n(3) Quit");
            option = input.nextLine();
            
            try
            {
                switch(Integer.parseInt(option))
                {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = input.nextLine();
                        
                        // FIXME: Insert your code here to find an entry by name and display it.
                        System.out.println((optionList.get(Integer.parseInt(option))).doOption(name));
                        break;
                        
                    case 2:
                        System.out.print("Enter email address: ");
                        String email = input.nextLine();
                        
                        // FIXME: Insert your code here to find an entry by email and display it.
                        System.out.println((optionList.get(Integer.parseInt(option))).doOption(email));
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
