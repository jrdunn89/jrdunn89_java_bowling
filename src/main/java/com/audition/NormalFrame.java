package com.audition;

import java.util.ArrayList;

public class NormalFrame extends Frame {
    
    private int score;

    public NormalFrame(ArrayList<Integer> scores, int first, int second) {
        super(scores);
        scores.add(first);
        scores.add(second);
        score = first + second;
    }

    public int getScore() {
        return score;
    }
}
