package training1;


import java.util.Scanner;

// 입력한 정숫값의 부호(양수/음수/0) 판단
public class training1_3 {


    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수");
        else if (n < 0)
            System.out.println("이 수는 음수");

        else
            System.out.println("이 수는 0");


    }
}
