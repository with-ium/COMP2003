package edu.curtin.addressbook.controller;

import java.io.*;
import java.util.*;
import edu.curtin.addressbook.view.*;
import edu.curtin.addressbook.model.*;

/**
 * A simple address book application.
 * @author Dave and ...
 */
public class AddressBookAppControl
{
    /** Used to obtain user input. */
    private static Scanner input = new Scanner(System.in);
    
    public static void fileMenu(String[] args)
    {
        String fileName;
        String entryName;
        
        System.out.print("Enter address book filename: ");
        fileName = input.nextLine();
        
        try
        {
            AddressBook addressBook = AddressBookAppData.readAddressBook(fileName);
            AddressBookAppView.showMenu(addressBook);
        }
        catch(IOException e)
        {
            System.out.println("Could not read from " + fileName + ": " + e.getMessage());
        }
    }
}
