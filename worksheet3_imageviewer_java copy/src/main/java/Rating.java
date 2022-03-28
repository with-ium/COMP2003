package edu.curtin.imageviewer;

public class Rating extends ImageRecordDecorator {
    protected String rating;

    public Rating(ImageRecord prev, String pRating) {
        super(prev);
        rating = " Rating: " + pRating;
    }

    @Override
    public String getCaption()
    {
        return prev.getCaption() + rating;
    }
}
