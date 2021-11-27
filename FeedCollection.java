package com.company;


public class FeedCollection {
    public static final int SIZE = 20;
    private static Feed[] feedArray;
public FeedCollection(){
    feedArray = new Feed[SIZE];
}
    public void setFeedArray(Feed[] feedArray) {
        this.feedArray = feedArray;
    }
    public Feed[] getFeedArray() {
        return feedArray;
    }
    public  void setFeedlocation (int location, Feed feed) {
        try{
           feedArray[location - 1] = feed;
        } catch (Exception e) {
            System.out.println("All the bins are full. \nMaximum size: " + SIZE);
        }
    }
public  int getNumberOfFullBins(){
    int counter = 0;
    for (int i = 0; i < SIZE; i++) {
        if (feedArray[i] != null && feedArray[i].isFull()) {
            counter++;
        }
    }
    return counter;
}
    public  Feed getNextBin() {
        for (int i = 0; i < SIZE; i++) {
            if (feedArray[i] != null && feedArray[i].isFull()) {
                return feedArray[i];
            }
        }
        return null;
    }
    //    set feed bin to empty
    public void emptyFeedNumber(int id) {
        feedArray[id].consume();
    }
    public int getSize() {
        return SIZE;
    }
    public  Feed getNextFullBin() {
        for (int i = 0; i < SIZE; i++) {
            if (feedArray[i] != null && feedArray[i].isFull()) {
                return feedArray[i];
            }
        }
        return null;
    }

}
