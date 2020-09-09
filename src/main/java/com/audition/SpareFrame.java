package com.audition;

import java.util.ArrayList;

public class SpareFrame extends Frame {

    public SpareFrame(ArrayList<Integer> scores, int first, int second) {
        super(scores);
        scores.add(first);
        scores.add(second);
    }

    // Score is 10 plus the score of the next roll
    public int getScore() {
        return 10 + getExtraBallOne();
    }
}
