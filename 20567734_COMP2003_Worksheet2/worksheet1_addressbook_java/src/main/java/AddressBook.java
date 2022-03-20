package edu.curtin.addressbook;

import java.util.*;

/**
 * Contains all the address book entries.
 * 
 * @author ...
 */
public class AddressBook
{
    // Insert your code here.
    private HashMap<String, Entry> nameMap;
    private HashMap<String, String> addressMap;

    public AddressBook() {
        nameMap = new HashMap<String, Entry>();
        addressMap = new HashMap<String, String>();
    }

    public void addNEntry(String k, Entry v) {
        nameMap.put(k, v);
    }

    public void addAEntry(String k, String v) {
        addressMap.put(k, v);
    }
    
    public String getNEntry(String k) {
        return (nameMap.get(k)).getAddress();
    }

    public String getAEntry(String k) {
        return (addressMap.get(k));
    }

    public String getNameMap() {
        return nameMap.toString();
    }

    public String getEmailMap() {
        return addressMap.toString();
    }
}
