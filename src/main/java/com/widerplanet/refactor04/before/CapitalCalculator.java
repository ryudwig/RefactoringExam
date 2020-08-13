package com.widerplanet.refactor04.before;

public class CapitalCalculator {

    private double _capital = 0.0;
    private double _intRate = 0.0;
    private double _duration = 0.0;
    private double _income = 0.0;
    private final double ADJ_FACTOR = 2.0;

    public void setIntRate(double _intRate) {
        this._intRate = _intRate;
    }

    public void setCapital(double _capital) {
        this._capital = _capital;
    }


    public double getAdjustedCapital(){
        double result = 0.0;
        if (_capital > 0.0){
            if(_intRate > 0.0 && _duration > 0.0 ) {
                result = (_income / _duration) * ADJ_FACTOR;
            }
        }
        return result;

    }

}
