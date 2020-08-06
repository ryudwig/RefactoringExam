package com.widerplanet.refactor03.example3.after;

import java.util.Enumeration;

public class HtmlStatement extends Statement {


    @Override
    protected String getFormattedRow(String result, double thisAmount, Rental each) {
        //대여하는 비디오 정보와 대여로를 출력 @@@
        result += "    " + each.getMovie().getTitle() + " : " + String.valueOf(thisAmount) + "<BR>";
        return result;
    }

    @Override
    protected String appendFooter(double totalAmount, int frequentRenterPoints, String result) {
        // HTML footer @@@
        result += " <P>누적 대여료 <EM>" + String.valueOf(totalAmount) + "</EM><P>\n ";
        result += "적립 포인트 <EM>" + String.valueOf(frequentRenterPoints) + "</EM><P>";
        return result;
    }


    @Override
    protected String getHeader(Customer customer) {
        // Header 가져오기 @@@
        String result = customer.getName() + "<Hl ><EM>" + customer.getName() + " 고객님의 대여 기록</EM></ H 1 ><P>\n";
        return result;
    }
}