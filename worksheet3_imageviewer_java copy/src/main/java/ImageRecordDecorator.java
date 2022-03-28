package edu.curtin.imageviewer;

public abstract class ImageRecordDecorator extends ImageRecord {
    protected ImageRecord prev;
    public ImageRecordDecorator(ImageRecord record) {this.prev = record;}

    @Override
    public void addFilename(String newFilename) {
        prev.addFilename(newFilename);
    }

    @Override
    public void addCaption(String newCaption) {
        prev.addCaption(newCaption);
    }

    @Override
    public String getFilename()
    {
        return prev.getFilename();
    }
    
    @Override
    public String getCaption()
    {
        return prev.getCaption();
    }
}
