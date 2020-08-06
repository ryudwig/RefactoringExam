package com.widerplanet.refactor03.example2;

public class Duplication {

    public void method() {
        int a = 1;
        int b = 2;
        int c = a+b;
        int d = b+c;
    }

    private int add(int a, int b) {
        return a+b;
    }

    private int total(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    private float average(int a, int b, int c, int d) {
        return (a+b+c+d)/4;
    }

}
