package com.widerplanet.refactor02.before;

class Person {

    private final Telephone telephone = new Telephone();
    private String _name;

    public String getName() {
        return _name;
    }

    // 아래는 모두 전화번호 관련 처리 로직
    public String getTelephone() {
        return "(" + telephone._officeAreaCode + ")" + telephone._officeNumber;
    }
    public void setTelephone(String number) {
        telephone.setTelephoneNumber(number);
    }

}