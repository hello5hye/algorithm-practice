package training1;


import java.util.Scanner;

// 1부터 n까지 합 구하기..
public class training1_10 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int n;
        System.out.println("1부터 n까지의 합");

        do {
            System.out.println("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n <= 0);      //  n이 0보다 클 때 까지 반복

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i < n) // 중간 과정
                System.out.println(i + " + ");
            else       // 마지막 과정
                System.out.println(i + " = ");
            sum += i;  // sum에 i를 더함
        }
        System.out.println(sum);


    }
}
