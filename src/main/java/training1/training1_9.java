package training1;


import java.util.Scanner;

// 양수만 입력해서 합 구하기..
public class training1_9 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int n;
        System.out.println("1부터 n까지의 합");

        do {
            System.out.println("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n <= 0);      //  n이 0보다 클 때 까지 반복

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");


    }
}
