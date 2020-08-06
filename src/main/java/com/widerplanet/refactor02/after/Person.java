package com.widerplanet.refactor02.after;

class Person {

    private final Telephone telephoneNumber = new Telephone();
    private String _name;

    public String getName() {
        return _name;
    }

    // 아래는 모두 전화번호 관련 처리 로직
    public String getTelephoneNumber() {
        return ( telephoneNumber.getTelephoneNumber());
    }
    public void setTelephoneNumber(String number) {
        Telephone.setTelephoneNumber(telephoneNumber, number);
    }

}