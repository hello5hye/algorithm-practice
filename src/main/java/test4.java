import java.util.Scanner;

public class test4 {

    // 숫자 역순으로 출력하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }

        scanner.close();
    }
}