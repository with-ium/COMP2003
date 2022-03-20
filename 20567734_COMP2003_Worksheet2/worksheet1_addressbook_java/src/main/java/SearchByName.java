package edu.curtin.addressbook;

public class SearchByName implements Option {

    private AddressBook addressBook;

    public SearchByName(AddressBook addBook) {
        addressBook = addBook;
    }

    @Override 
    public String doOption(String s) {
        return addressBook.getNEntry(s); 
    }

    @Override
    public boolean requiresText() {
        return true;
    }
}