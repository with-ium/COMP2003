package edu.curtin.imageviewer;

public class Date extends ImageRecordDecorator {
    protected String date;

    public Date(ImageRecord prev, String pDate) {
        super(prev);
        date = " Date: " + pDate;
        
    }

    @Override
    public String getCaption()
    {
        return prev.getCaption() + date;
    }
}
