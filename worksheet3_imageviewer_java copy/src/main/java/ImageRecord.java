package edu.curtin.imageviewer;

/**
 * Represents an image in an album.
 */
public class ImageRecord
{
    private String filename;
    private String caption;
    
    public ImageRecord() {}

    public ImageRecord(String newFilename, String newCaption) {
        filename = newFilename;
        caption = newCaption;
    }
    
    public void addFilename(String newFilename) {
        filename = newFilename;
    }

    public void addCaption(String newCaption) {
        caption = newCaption;
    }
    
    public String getFilename()
    {
        return filename;
    }
    
    public String getCaption()
    {
        return caption;
    }
}

