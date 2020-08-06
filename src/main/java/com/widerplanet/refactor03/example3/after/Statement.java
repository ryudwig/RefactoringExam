package com.widerplanet.refactor03.example3.after;

import java.util.Enumeration;

public abstract class Statement {

    public String getStatement(Customer customer) {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = customer.get_rentals().elements();

        String result = getHeader(customer);

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //비디오 종류별 대여로 계산
            thisAmount = each.amountFor();

            //적립 포인트 1포인트 증
            frequentRenterPoints++;

            //최신물을 이틀 이상 대여하면 보너스 포인트 지급
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;


            result = getFormattedRow(result, thisAmount, each);

            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }

        result = appendFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }

    protected abstract String getFormattedRow(String result, double thisAmount, Rental each);

    protected abstract String appendFooter(double totalAmount, int frequentRenterPoints, String result);

    protected abstract String getHeader(Customer customer);
}
