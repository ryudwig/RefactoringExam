package com.widerplanet.refactor02.before;

public class Matcher {

        public Matcher() {
        }

        // 배열값의 각 요소들이 이에 대응되는 예측 값과 허용범위 내의 차이를 갖는지 체크한다.
        public boolean compare(int[] expected, int[] actual, int clipLimit, int delta) {

            // clipLimit보다 큰 값을 잘라낸다.
            for (int i = 0; i < actual.length; i++)
                if (actual[i] > clipLimit)
                    actual[i] = clipLimit;

            // 비교하려는 두 배열값의 길이가 같은지 체크한다.
            if (actual.length != expected.length)
                return false;

            // 배열의 각 값의 차이가 delta를 벗어나는지 체크한다.
            for (int i = 0; i < actual.length; i++)
                if (Math.abs(expected[i] - actual[i]) > delta)
                    return false;

            return true;
        }

}
