package training1;


import java.util.Scanner;

// 이중 루프로 구구단 곱셉표 출력
public class training1_16 {
    public static void main(String[] args) {
        System.out.println("--------구구단 곱셈표--------");

        System.out.print("     |");
        for(int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n--------------------");




        for(int i = 1; i <= 9; i++)  {
            for (int j=1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();

        }
    }
}
