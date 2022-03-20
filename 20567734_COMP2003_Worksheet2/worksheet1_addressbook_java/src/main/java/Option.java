package edu.curtin.addressbook;

public interface Option {
    // abstract methods
    public abstract String doOption(String s);  
    public abstract boolean requiresText();
}
