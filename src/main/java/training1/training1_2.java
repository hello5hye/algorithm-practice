package training1;

import java.util.Scanner;


// 3개의 정숫값 가운데 최댓값을 구하여 출력
public class training1_2 {

    // a, b, c의 최댓값을 구하여 반환
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3 (3, 2, 1) = " + max3(3, 2, 1));
    }
}
