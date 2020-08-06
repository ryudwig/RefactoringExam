package com.widerplanet.refactor02.after;

public class Telephone {
    String _officeAreaCode;
    String _officeNumber;

    public Telephone() {
    }

    public static void setTelephoneNumber(Telephone telephone, String telephoneNumber) {
        telephone._officeAreaCode = telephoneNumber.substring(0, 3);
        telephone._officeNumber = telephoneNumber.substring(3);
    }

    public String getTelephoneNumber(){
        return "(" + _officeAreaCode + ")" + _officeNumber;
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