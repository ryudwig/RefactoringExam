package com.widerplanet.refactor03.example3.after;

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

    public Vector get_rentals() {
        return _rentals;
    }

    public String getStatement(String format){
        Statement statement = null;
        switch(format){
            case "html":
                statement = new HtmlStatement();
                break;
            case "text":
                statement = new TextStatement();
                break;
        }

        return statement.getStatement(this);

    }
}