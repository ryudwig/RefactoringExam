package com.widerplanet.refactor01.trainning;

public class Rental {
    Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        //적립 포인트 1포인트 증
        frequentRenterPoints ++;

        //최신물을 이틀 이상 대여하면 보너스 포인트 지급
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}