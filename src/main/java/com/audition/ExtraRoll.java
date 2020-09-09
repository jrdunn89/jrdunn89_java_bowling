package com.audition;

import java.util.ArrayList;

public class ExtraRoll extends Frame {

    public ExtraRoll(ArrayList<Integer> currentScores, int extraRoll) {
        super(currentScores);
        scores.add(extraRoll);
    }

    public int getScore() {
        return 0;
    }

    public int getFrameSize() {
        return 0;
    }
}
