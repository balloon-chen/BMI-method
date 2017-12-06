package com.example.couldthisbelove;

import java.util.Random;

public class loveCalculator {

    public static void main(String[] args) {
        System.out.println("Your love score is: " + ifYouHadMyLove("Mr X", "Miss Y"));
    }

    public static int ifYouHadMyLove(String youtName, String theirName){
        Random randomObject = new Random();
        int loveScore = randomObject.nextInt(101);
        if (loveScore > 80){
            System.out.println("GOOD!");
        }
        else if (loveScore > 40){
            System.out.println("SOSO!");
        }
        else {
            System.out.println("OHNO!");
        }
        return loveScore;
    }

}
