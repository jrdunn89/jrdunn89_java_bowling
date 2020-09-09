package com.audition;

import java.util.ArrayList;

public class Bowling {

    private ArrayList<Frame> frameThrows;
    private ArrayList<Integer> scores;

    public Bowling() {
        frameThrows = new ArrayList<Frame>();
        scores = new ArrayList<Integer>();
    }
    
    // Add a Frame
    public void addFrame(int first, int second) {
        NormalFrame normalFrame = new NormalFrame(scores, first, second);
        frameThrows.add(normalFrame);
    }

    // Add a Frame with a Spare
    public void addSpareFrame(int first, int second) {
        SpareFrame spareFrame = new SpareFrame(scores, first, second);
        frameThrows.add(spareFrame);
    }

    // Add a Frame with a Strike
    public void addStrikeFrame() {
        StrikeFrame strikeFrame = new StrikeFrame(scores);
        frameThrows.add(strikeFrame);
    }

    // Add an extra roll in the last Frame
    public void addExtraRoll(int roll) {
        ExtraRoll extraRoll = new ExtraRoll(scores, roll);
        frameThrows.add(extraRoll);
    }

    // Return the current score
    public int getScore() {
        int total = 0;
        // Iterate through each frame
        for (Frame frameThrow : frameThrows) {
            total += frameThrow.getScore(); // Get Score from Current Frame
        }
        return total;
    }
}
