package edu.curtin.addressbook;

public class DisplayEntries implements Option {
    
    private AddressBook addressBook;
    private boolean rqText;

    public DisplayEntries(AddressBook addBook, boolean rqrText) {
        addressBook = addBook;
        rqText = rqrText;
    }

    @Override 
    public String doOption(String s) {
        return s;
    }

    @Override
    public boolean requiresText() {
        return rqText;
    }

    public void displayAll() {
        System.out.println(addressBook.getNameMap().toString());
        System.out.println(addressBook.getEmailMap().toString());
    }
}
