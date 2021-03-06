package com.widerplanet.refactor03.example3.before;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String getStatement(char format){

        switch(format){
            case 'H':
                return htmlStatement();
            case 'T':
                return textStatement();
            default:
                return "";
        }
    }

    private String textStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while(rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //비디오 종류별 대여로 계산
            thisAmount = each.amountFor();

            //적립 포인트 1포인트 증
            frequentRenterPoints ++;

            //최신물을 이틀 이상 대여하면 보너스 포인트 지급
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //대여하는 비디오 정보와 대여로를 출
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";

            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }

        //footer
        result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }

    private String htmlStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = getName() + "<Hl ><EM>" + getName() + " 고객님의 대여 기록</EM></ H 1 ><P>\n";

        while(rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //비디오 종류별 대여로 계산
            thisAmount = each.amountFor();

            //적립 포인트 1포인트 증
            frequentRenterPoints ++;

            //최신물을 이틀 이상 대여하면 보너스 포인트 지급
            if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //대여하는 비디오 정보와 대여로를 출
            result += "    " + each.getMovie().getTitle() + " : " + String.valueOf(thisAmount) + "<BR>";

            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }

        // HTML footer
        result += " <P>누적 대여료 <EM>" + String.valueOf(totalAmount) + "</EM><P>\n ";
        result += "적립 포인트 <EM>" + String. valueOf(frequentRenterPoints) + "</EM><P>";
        return result;
    }

}