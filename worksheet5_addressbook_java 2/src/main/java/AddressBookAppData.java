package edu.curtin.addressbook.model;

import java.io.*;
import edu.curtin.addressbook.view.*;
import edu.curtin.addressbook.controller.*;

public class AddressBookAppData {
    /**
     * Read the address book file, containing all the names and email addresses.
     *
     * @param fileName The name of the address book file.
     * @return A new AddressBook object containing all the information.
     * @throws IOException If the file cannot be read.
     */
    public static AddressBook readAddressBook(String fileName) throws IOException
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
}
