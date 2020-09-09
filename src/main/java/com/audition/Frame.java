package com.audition;

import java.util.ArrayList;

abstract class Frame {
    protected ArrayList<Integer> scores;
    protected int currentBall;

    abstract public int getScore();

    public Frame(ArrayList<Integer> scores) {
        this.scores = scores;
        this.currentBall = scores.size();
    }

    // First extra ball for Spare/Strike
    protected int getExtraBallOne() {
        return (int) this.scores.get(this.currentBall + getFrameSize());
    }

    // Second extra ball for Strike
    protected int getExtraBallTwo() {
        return (int) this.scores.get(this.currentBall + getFrameSize() + 1);
    }

    // Default frame size
    protected int getFrameSize() {
        return 2;
    }
}