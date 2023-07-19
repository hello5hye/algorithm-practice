package training1;

import java.util.Scanner;

// 연습 문제 8
// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드
public class q8 {

    static int sumof(int a, int b) {
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++)
                sum += i;
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }




        return sum;
    }

    public static void main(String[] args) {
        System.out.println("3부터 5까지 합은.. " + sumof(3,5));
    }
}
