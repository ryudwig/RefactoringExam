package com.widerplanet.refactor01.trainning;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    //리팩토링이 필요한 핵심 메서드
    //너무 많은 기능을 가지고 있다
    public String statement() {

        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while(rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();

            //대여하는 비디오 정보와 대여로를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each._movie.getCharge(each.getDaysRented())) + "\n";

        }

        frequentRenterPoints = getTotalFrequentRenterPoints();


        //footer
        result += "누적 대여료 : " + String.valueOf(getTotalAmount()) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }

     public String htmlStatement() {

        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while(rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();

            //대여하는 비디오 정보와 대여로를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each._movie.getCharge(each.getDaysRented())) + "\n";

        }

        frequentRenterPoints = getTotalFrequentRenterPoints();


        //footer
        result += "누적 대여료 : " + String.valueOf(getTotalAmount()) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }

    public int getTotalFrequentRenterPoints() {

        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while(rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();

        }
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        Enumeration<Rental> rentals = _rentals.elements();
        double totalAmount = 0;

        while(rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();
            //현재까지 누적된 총 대여료
            totalAmount += each._movie.getCharge(each.getDaysRented());
        }
        return totalAmount;
    }


}