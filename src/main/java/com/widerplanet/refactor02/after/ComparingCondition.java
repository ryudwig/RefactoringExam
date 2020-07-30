package com.widerplanet.refactor02.after;

public class ComparingCondition {
    private final int clipLimit;
    private final int delta;

    public ComparingCondition(int clipLimit, int delta) {
        this.clipLimit = clipLimit;
        this.delta = delta;
    }

    public int getClipLimit() {
        return clipLimit;
    }

    public int getDelta() {
        return delta;
    }
}
