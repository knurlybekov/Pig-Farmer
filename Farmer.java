package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Farmer {
    static PigCollection pc = new PigCollection();
    static FeedCollection fc = new FeedCollection();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate localdate = LocalDate.now();
        String db = localdate.toString();
        int pigid = 0;

        System.out.println("Welcome to FARMER program!");
        System.out.println("1.Add Pig");
        System.out.println("2.Add Feed");
        System.out.println("3.FeedPigs");
        System.out.println("4.Report");
        System.out.println("5.EXIT");
        int choice = scan.nextInt();
        while(choice >=1 && choice <= 5) {
            switch (choice) {
                case 1:
                    System.out.println("Let`s create a pig");
                    pigid++;
                    System.out.println("What`s pig name?");
                    String pname = scan.next();
                    System.out.println("What`s pig sex? Male/Female");
                    String psex = scan.next();
                    System.out.println("What`s pig color?");
                    String pcolor = scan.next();
                    System.out.println("You CREATED a pig.");
                    Pig pig = new Pig(pname, psex, pcolor, db);
                    pc.addPig(pig);
                    System.out.println("ID: " + pigid + "\tName: " + pname + "\tSex: "
                            + psex + "\tColor: " + pcolor + "\tDate of Birth: " + db);
                    choice = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Let`s create a feed");
                    System.out.println("How many number of bin do yoy want?");
                    int nb = scan.nextInt();
                    System.out.println("Feed type: ");
                    String ft = scan.nextLine();
                    System.out.println("Weight (in kg): ");
                    double wkg = scan.nextDouble();
                    Feed newFeed = new Feed(ft);
                    fc.setFeedlocation(nb, newFeed);
                    System.out.println("Feed has been added at " + nb);
                    choice = scan.nextInt();
                    break;

                case 3:
                    if (pc.isEmpty()){
                        System.out.println("You do not have any pigs. Please add them.");
                    } else {
                        for (int i = 0; i < pc.getPigCount(); i++) {
                            Feed tempf = fc.getNextFullBin();
                            System.out.println(fc.getNumberOfFullBins() + " bin(s) available.");
                            if (tempf != null) {
                                pc.getPigArray()[i].feed(tempf);
                                System.out.println("Bin used!");
                            } else {
                                System.out.println("No more bins are left! Go back and add one...");
                                break;
                            }
                            break;
                        }
                    }
                case 4:
                    System.out.println("Bins avalible: " + fc.getSize());
                    String pigList = pc.getPigList();
                    System.out.println("Total pigs: "+pc.getPigCount());
                    System.out.println("Pigs: " + pigList);
                    choice = scan.nextInt();
                    break;
                case 5:
                    System.exit(0);

            }
    }
}}
