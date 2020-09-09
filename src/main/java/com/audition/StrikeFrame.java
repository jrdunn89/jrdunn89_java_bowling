package com.audition;

import java.util.ArrayList;

public class StrikeFrame extends Frame {

    public StrikeFrame(ArrayList<Integer> scores) {
        super(scores);
        scores.add(10);
    }

    // Score is 10 plus the score of the next two rolls
    public int getScore() {
        return 10 + getExtraBallOne() + getExtraBallTwo();
    }

    // Overriding Frame Size
    public int getFrameSize() {
        super.getFrameSize();
        return 1;
    }
}
