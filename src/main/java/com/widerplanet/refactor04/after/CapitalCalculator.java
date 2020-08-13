package com.widerplanet.refactor04.after;

public class CapitalCalculator {
    private double _capital = 0.0;
    private double _intRate = 0.0;
    private double _duration = 0.0;
    private double _income = 0.0;
    private final double ADJ_FACTOR = 2.0;

    public double getAdjustedCapital() {
        double result = 0.0;
        if (_capital <= 0.0) return result;
        if (isNoProfit()) return result;
        return (_income / _duration) * ADJ_FACTOR;
    }

    private boolean isNoProfit() {
        return _intRate <= 0.0 || _duration <= 0.0;
    }
}
