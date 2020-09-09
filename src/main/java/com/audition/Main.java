package com.audition;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bowling game = new Bowling();
        Random r = new Random();

        for (int frame = 1; frame <= 10; frame++) {
            int max = 10;
            int firstRoll = 10; //r.nextInt(max);
            int secondRoll = 0;

            if (firstRoll == 10) {
                game.addStrikeFrame();
            } else {
                max = max - firstRoll;
                secondRoll = r.nextInt(max);

                if (secondRoll == max) {
                    game.addSpareFrame(firstRoll, secondRoll);
                } else {
                    game.addFrame(firstRoll, secondRoll);
                }
            }

            if (frame == 10) {
                max = 10;
                if (firstRoll == 10) {
                    firstRoll = 10; //r.nextInt(max);
                    game.addExtraRoll(firstRoll);

                    if (firstRoll == 10) {
                        firstRoll = 10; //r.nextInt(max);
                        game.addExtraRoll(firstRoll);
                    } else {
                        max = max - firstRoll;
                        secondRoll = r.nextInt(max);
                        game.addExtraRoll(secondRoll);
                    }
                } else if (firstRoll + secondRoll == 10) {
                    max = 10;
                    firstRoll = r.nextInt(max);
                    game.addExtraRoll(firstRoll);
                }
            }
        }

        System.out.println("Final Score: " + game.getScore());
    }
}