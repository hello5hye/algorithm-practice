package training1;

import java.util.Scanner;

// 세 값의 대소 관계인 13가지 조합의 중앙 값을 구하여 출력하는 프로그램 (training1_2 참고)
public class Median_q {

    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    // 13가지 조합의 중앙 값
    public static void main(String[] args) {

        // 1. a > b > c
        System.out.println("(3, 2, 1) 중앙 값은 : " + med3(3, 2, 1) + "입니다.");

        // 2. a > b = c
        System.out.println("(3, 2, 2) 중앙 값은 : " + med3(3, 2, 2) + "입니다.");

        // 3. c > a > b
        System.out.println("(4, 5, 7) 중앙 값은 : " + med3(4, 5, 7) + "입니다.");

        // 4. a = b < c
        System.out.println("(4, 4, 7) 중앙 값은 : " + med3(4, 4, 7) + "입니다.");

        // 5. a = b = c
        System.out.println("(3, 3, 3) 중앙 값은 : " + med3(3, 3, 3) + "입니다.");

        // 6. a = b > c
        System.out.println("(4, 4, 1) 중앙 값은 : " + med3(4, 4, 1) + "입니다.");

        // 7. b > c > a
        System.out.println("(1, 4, 3) 중앙 값은 : " + med3(1, 4, 3) + "입니다.");

        // 8. c > a = b
        System.out.println("(2, 2, 3) 중앙 값은 : " + med3(2, 2, 3) + "입니다.");

        // 9. c > b > a
        System.out.println("(3, 4, 5) 중앙 값은 : " + med3(3, 4, 5) + "입니다.");

        // 10. b > a > c
        System.out.println("(3, 4, 2) 중앙 값은 : " + med3(3, 4, 2) + "입니다.");

        // 11. b > a = c
        System.out.println("(3, 4, 3) 중앙 값은 : " + med3(3, 4, 3) + "입니다.");

        // 12. b = c > a
        System.out.println("(1, 3, 3) 중앙 값은 : " + med3(1, 3, 3) + "입니다.");

        // 13. a = c > b
        System.out.println("(4, 2, 4) 중앙 값은 : " + med3(4, 2, 4) + "입니다."); // ?


    }
}
