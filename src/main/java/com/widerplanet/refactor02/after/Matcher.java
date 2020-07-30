package com.widerplanet.refactor02.after;

public class Matcher {

    public Matcher() {
    }

    // 배열값의 각 요소들이 이에 대응되는 예측 값과 허용범위 내의 차이를 갖는지 체크한다.
    public boolean compareWithCondition(int[] expected, int[] actual, ComparingCondition comparingCondition) {

        applyClicpLimit(actual, comparingCondition.getClipLimit());

        if (checkArrayLength(expected, actual)) return false;
        if (checkRangeInDelta(expected, actual, comparingCondition.getDelta())) return false;

        return true;
    }

    private boolean checkRangeInDelta(int[] expected, int[] actual, int delta) {
        // 배열의 각 값의 차이가 delta를 벗어나는지 체크한다.
        for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta)
                return true;
        return false;
    }

    private boolean checkArrayLength(int[] expected, int[] actual) {
        // 비교하려는 두 배열값의 길이가 같은지 체크한다.
        if (actual.length != expected.length)
            return true;
        return false;
    }

    private void applyClicpLimit(int[] actual, int clipLimit) {
        // clipLimit보다 큰 값을 잘라낸다.
        for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;
    }


}
