package training1;

import java.util.Scanner;

// 연습 문제 9
// 두 변수  a, b에 정수를 입력하고 b - a를 출력하는 프로그램 작성하기
// b가 a보다 큰 값이어야 함.
public class q9 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        int a, b;

        System.out.println("a 값 입력 : ");
        a = stdIn.nextInt();

        System.out.println("b 값 입력 : ");
        b = stdIn.nextInt();

        do {
            System.out.println("a보다 큰 값을 입력하세요!");

            System.out.println("a 값 입력 : ");
            a = stdIn.nextInt();
            System.out.println("b 값 입력 : ");
            b = stdIn.nextInt();
        } while (b <= a); // b가 a보다 클 때까지 반복하기
        int minus = 0;
        minus = b - a;

        System.out.println("b-a는 " + minus + "입니다.");




    }
}
