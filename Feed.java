package com.company;

public class Feed {
    private static int binCount;

    private final String feedName;

    public static int getAmount() {
        return binCount;
    }

    public String getFeedName() {
        return feedName;
    }


    public static void Consume() {
        if (binCount > 0) {
            binCount -= 3;
        }else{
            System.out.println("There is no food bins left to feed.");
        }
    }
    Feed(String feedName_f, int binCount_b) {
        feedName = feedName_f;
        binCount = binCount + binCount_b;
    }

}
