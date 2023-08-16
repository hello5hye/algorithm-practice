package training1;


import java.util.Scanner;

// 1부터 n까지 구하는 과정 출력
public class training1_11 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int n;
        System.out.println("1부터 n까지의 합");

        do {
            System.out.println("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n <= 0);      //  n이 0보다 클 때 까지 반복

        int sum = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;  // sum에 i를 더함
        }
        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);


    }
}
