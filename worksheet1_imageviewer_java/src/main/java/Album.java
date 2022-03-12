package edu.curtin.imageviewer;
import java.util.*;

/**
 * Represents an album of images.
 */
public class Album 
{
    // FIXME: Insert your fields, constructors and methods here.
    private ArrayList<String> fileNames;
    private ArrayList<String> captions;
    private int curIdx;

    public Album() {
        fileNames = new ArrayList<String>();
        captions = new ArrayList<String>();
        curIdx = 0;
    }

    public void addFileName(String fileName) {
        fileNames.add(fileName);
    }

    public void addCaption(String caption) {
        captions.add(caption);
    }

    public String getFileName(int idx) {
        return fileNames.get(idx);
    }

    public String getCaption(int idx) {
        return captions.get(idx);
    }

    public int getIdx() {
        return curIdx;
    }

    public void setIdx(int idx) {
        if (-1 < idx && idx < fileNames.size()) {
            curIdx = idx;
        }
    }
}
