package training1;


import java.util.Scanner;

// *를 n개 출력, w 개마다 줄을 바꿔서 출력
public class training1_14 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int n, w;
        System.out.println("*를 n개 출력, w 개마다 줄을 바꿔서 출력");

        do {
            System.out.print("n 값 입력 : ");
            n = stdIn.nextInt();
        } while (n <= 0);      //  n이 0보다 클 때 까지 반복

        do {
            System.out.print("w 값 입력 : ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n);

//        for (int i = 0; i < n; i++) {
//            System.out.print("*");
//
//            if (i % w == w -1)
//                System.out.println(); // 줄 바꿈
//        }
//
//        if (n % w != 0)
//            System.out.println(); // 줄 바꿈

        // 1-15
        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));

        }
        int rest = n % w;

        if (rest != 0)
            System.out.println("*".repeat(rest));



    }
}
