package com.company;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 10;
        String word = "bottles";

        while (beerNum >= 0) {
            if (beerNum == 1) {
                word = "bottle";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on wall");
                System.out.println("Take me down");
                System.out.println("Pass it around.");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
            beerNum--;
        }
    }
}
