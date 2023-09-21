package training1;


import java.util.Scanner;

// 왼쪽 아래가 직각인 이등변 삼각형을 출력
public class training1_17 {
    public static void main(String[] args) {
        // 입력 받아서 하는거
//        Scanner stdIn = new Scanner(System.in);
//        int n;
//        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
//
//        do {
//            System.out.print("몇 단 삼각형입니까? : ");
//            n = stdIn.nextInt();
//        } while (n <= 0);
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print('*');
//            System.out.println();
//        }

        triangleLB(4);
    }

    static void triangleLB(int n) {

        if (n <= 0) {
            System.out.println("삼각형의 크기는 0보다 커야 합니다.");
            return;
        }
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();

        }

    }
}
