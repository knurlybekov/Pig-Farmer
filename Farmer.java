package com.company;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

public class Farmer {

    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        boolean run = true;
        String db = localdate.toString();
        //Create two different types of feed: apple and potato
        int appleBins = 0;
        int potatoBins = 0;
        Pig pig1 = new Pig("Baha", "Brown", "male", db);//YY,MM,DD
        Pig pig2 = new Pig("Yera", "White", "male", db);
        Pig pig3 = new Pig("Maha", "Black", "Female", db);
        Scanner scan = new Scanner(System.in);
        String feed;
        String choice = "";
        do {
            System.out.println("1.Info about pigs");
            System.out.println("2.Feed info and feed pigs");
            System.out.println("TO EXIT PRESS TWICE <ENTER>");
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1st pig name is " + pig1.getName() + "\n gender: " + pig1.getSex() + "\n pig color: " + pig1.getColor() + "\n Date of Birth: " + pig1.getDateOfBirth());
                    System.out.println();
                    System.out.println("2nd pig name is " + pig2.getName() + "\n gender: " + pig2.getSex() + "\n pig color: " + pig2.getColor() + "\n Date of Birth: " + pig2.getDateOfBirth());
                    System.out.println();
                    System.out.println("3rd pig name is " + pig3.getName() + "\n gender: " + pig3.getSex() + "\n pig color: " + pig3.getColor() + "\n Date of Birth: " + pig3.getDateOfBirth());
                    System.out.println();
                    break;
                case "2":
                    System.out.println("How many new bins of Apple do you have?");
                    appleBins = scan.nextInt();
                    Feed feed1 = new Feed("Apple", appleBins);
                    System.out.println("How many new bins of Potato do you have?");
                    potatoBins = scan.nextInt();
                    Feed feed2 = new Feed("Potato", potatoBins);
                    System.out.println("Do you want to feed the pigs?(Y/N)");
                    String fdpg;
                    fdpg = scan.next();
                    switch (fdpg) {
                        case "Y":
                            Feed.Consume();
                            System.out.println(pig1.getName() + ", " + pig2.getName() + " and " + pig3.getName() + " ate " + feed1.getFeedName() + " and " + feed2.getFeedName());
                            System.out.println("Total left: " + Feed.getAmount() + " bins");
                            System.out.println("Would you like to go again?? \nY/N");
                            fdpg = scan.next();
                            switch (fdpg) 
                            {
                                case "Y":
                                    Feed.Consume();
                                    System.out.println(pig1.getName() + ", " + pig2.getName() + " and " + pig3.getName() + " ate " + feed1.getFeedName() + " and " + feed2.getFeedName());
                                    System.out.println("Total left: " + Feed.getAmount() + " bins");
                                    System.out.println("Would you like to go again?? \nY/N");
                                    fdpg = scan.next();
                                    break;
                                case "N":
                                    System.out.println("The pigs will not be fed.");
                                    System.out.println("Total left: " + Feed.getAmount() + " bins");
                                    break;
                             }
                                case "N":
                                    System.out.println("The pigs will not be fed.");
                                    System.out.println("Total left: " + Feed.getAmount() + " bins");
                                break;
                            }
                        }
        }while (!choice.isEmpty());
    }
}
