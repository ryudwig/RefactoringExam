package com.widerplanet.refactor03.example3.after;

public class TextStatement extends Statement{


    protected String getHeader(Customer customer) {
        String result = customer.getName() + " 고객님의 대여 기록 \n";
        return result;
    }


    protected String appendFooter(double totalAmount, int frequentRenterPoints, String result) {
        //footer
        result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }


    protected String getFormattedRow(String result, double thisAmount, Rental each) {
        //대여하는 비디오 정보와 대여로를 출
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        return result;
    }
}