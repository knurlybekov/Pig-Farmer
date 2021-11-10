package com.company;
import java.util.Date;

public class Pig {
    private static int track = 0;

    private boolean isFemale;
    private String name, color, sex;
    private String dateOfBirth;

    public static int getCount() {
        return track;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public boolean isFemale() {
        return false;
    }
    Pig(String name_n, String color_c, String sex_s, String dateOfBirth_d) {
        name = name_n;
        sex = sex_s;
        color = color_c;
        dateOfBirth = dateOfBirth_d;
        track++;
    }
    public void feed(Feed foodNo) {
        foodNo.Consume();
    }
}
