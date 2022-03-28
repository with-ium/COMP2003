package edu.curtin.imageviewer;
import java.util.*;

/**
 * Represents an album of images.
 */
public class Album 
{
    // FIXME: Insert your fields, constructors and methods here.
    private ArrayList<ImageRecord> records;
    private int curIdx;

    public Album() {
        records = new ArrayList<ImageRecord>();
        curIdx = 0;
    }

    public void addImage(ImageRecord newRecord) {
        records.add(newRecord);
    }

    public String getFileName(int idx) {
        ImageRecord curRecord = records.get(idx);
        return curRecord.getFilename();
    }

    public String getCaption(int idx) {
        ImageRecord curRecord = records.get(idx);
        return curRecord.getCaption();
    }

    public int getIdx() {
        return curIdx;
    }

    public void setIdx(int idx) {
        if (-1 < idx && idx < records.size()) {
            curIdx = idx;
        }
    }
}
