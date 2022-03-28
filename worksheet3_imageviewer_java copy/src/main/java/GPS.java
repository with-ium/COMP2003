package edu.curtin.imageviewer;

public class GPS extends ImageRecordDecorator {
    protected String gps;

    public GPS(ImageRecord prev, String pGps) {
        super(prev);
        gps = " GPS: " + pGps;
    }

    @Override
    public String getCaption()
    {
        return prev.getCaption() + gps;
    }
}
