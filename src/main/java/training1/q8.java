package training1;

import java.util.Scanner;

// 연습 문제 8
// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드
public class q8 {

    static int sumof(int a, int b) {
        int sum = 0;

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합");
        System.out.println("n 값 입력 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        // 하나의 변수를 사용하는 반복문은 while 보다 for 문을 사용하는 것이 좋다.
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1 부터 " + n + " 까지의 합은 " + sum + "입니다.");

        // 연습문제 q7.가우스 덧셈을 이용해서 구해보기 ex) (1+10) * 5
        int i = 1;

        if (i <= n) {
            sum = n * (n + i) / 2;
        }
        System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");
    }
}
