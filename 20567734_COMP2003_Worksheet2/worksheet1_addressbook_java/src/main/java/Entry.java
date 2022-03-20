package edu.curtin.addressbook;

import java.util.*;
        
/**
 * Represents a single address book entry.
 * 
 * @author ...
 */
public class Entry 
{
    // Insert your code here.
    private String name;
    private HashSet<String> address;

    public Entry(String newName) {
        name = newName;
        address = new HashSet<String>();
    }

    public void addAddress(String newAddress) {
        address.add(newAddress);
    }

    public String getAddress() {
        return address.toString();
    }

    public String getName() {
        return name;
    }
}
