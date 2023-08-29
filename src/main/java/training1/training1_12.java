package training1;


import java.util.Scanner;

// 1부터 n까지 구하는 과정 출력
public class training1_12 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int n;
        System.out.println("1부터 n까지의 합");

        do {
            System.out.println("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n <= 0);      //  n이 0보다 클 때 까지 반복


//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0)
//                System.out.print("+");
//            else
//                System.out.print("-");
//        }

        // 1_13

        for (int i = 0; i < n /2; i++) {
            System.out.print("+-");

            if (n % 2 !=0)
                System.out.print("+");
        }



    }
}
