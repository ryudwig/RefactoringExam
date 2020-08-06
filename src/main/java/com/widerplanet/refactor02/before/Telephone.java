package com.widerplanet.refactor02.before;

public class Telephone {
    String _officeAreaCode;
    String _officeNumber;

    public Telephone() {
    }

    public void setTelephoneNumber(String telephoneNumber) {
        _officeAreaCode = telephoneNumber.substring(0, 3);
        _officeNumber = telephoneNumber.substring(3);
    }

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    private void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }

    private void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}