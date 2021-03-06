package com.widerplanet.refactor01.done;

import com.widerplanet.refactor01.done.Customer;
import com.widerplanet.refactor01.done.Movie;
import com.widerplanet.refactor01.done.Rental;

public class MainApp {

    public static void main(String[] args) {

        Customer customer = new Customer("와이더님");

        Movie movie1 = new Movie("킬링이브", com.widerplanet.refactor01.before.Movie.NEW_RELEASE);
        Movie movie2 = new Movie("그녀", Movie.CHILDREN);

        Rental rental = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);

        customer.addRental(rental);
        customer.addRental(rental2);

        System.out.println(customer.statement());

    }

}
