package com.company;

public class Feed {
    private static int binCount;
    public static String feedName;
    private static boolean isFull;
    private static double weight;


    //    getters and setters
    public  String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public static double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //A constructor that accepts a parameters: A String type for name of feed
    Feed(String feedName_f) {
        feedName = feedName_f;
        isFull = true;
    }
    // A public method called add which receives an int value and adds that to the number of bins
    public void add(int addBin) {
        binCount += addBin;
    }
    public void consume() {
            isFull = false;
    }
}
