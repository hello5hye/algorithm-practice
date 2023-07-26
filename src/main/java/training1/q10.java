package training1;

import java.util.Scanner;

// 연습 문제 10
// 양의 정수 입력하고 자릿수를 출력하는 프로그램

public class q10 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        int a, sum = 0;

        do {
            System.out.println("양의 정수만 입력하세요.");

            System.out.println("a 값 입력 : ");
            a = stdIn.nextInt();
        } while (a <= 0); // a가 0보다 클 때까지 반복하기


        String str_a = Integer.toString(a);

        for (int i = 0; i <str_a.length() + 1; i++)
            sum = i;
        System.out.println("a의 자릿 수는 " + sum + "입니다.");




    }
}
