package training1;


import java.util.Scanner;

// while 문으로 1부터 n까지의 합
public class training1_7 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("1부터 n까지의 합");
        System.out.println("n 값 입력 : ");
        int n = stdIn.nextInt();

        int sum = 0;

//        int i = 1;
//        while (i <= n) { // i가 n 이하면 반복
//            sum += i; // sum에 i를 더함
//            i++;      // i값을 1만큼 증가시킴
//        }


        // 하나의 변수를 사용하는 반복문은 while 보다 for 문을 사용하는 것이 좋다.
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }

//        System.out.println("1 부터 " + n + " 까지의 합은 " + sum + "입니다.");

        // 연습문제 q7.가우스 덧셈을 이용해서 구해보기 ex) (1+10) * 5
        int i = 1;

        if (i <= n) {
            sum = n * (n + i) / 2;
        }
        System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");


    }
}
