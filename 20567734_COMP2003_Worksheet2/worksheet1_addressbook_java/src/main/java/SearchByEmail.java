package edu.curtin.addressbook;

public class SearchByEmail implements Option {

    private AddressBook addressBook;

    public SearchByEmail(AddressBook addBook) {
        addressBook = addBook;
    }

    @Override 
    public String doOption(String s) {
        return addressBook.getAEntry(s);
    }

    @Override
    public boolean requiresText() {
        return true;
    }
}
