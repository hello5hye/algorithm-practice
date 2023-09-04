package training1;


import java.util.Scanner;

// 2자리의 양수(10~99)를 입력
public class training1_16 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        int no;
        System.out.println("2자리의 양수를 입력하세요");

        do {
            System.out.print("no 값 입력 : ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수 no값은 " + no + "이 되었습니다.");



    }
}
