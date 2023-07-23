import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int answer = 0;
        String abc;

        int a = 3;
        int b = 4;

        String at = Integer.toString(a);
        String bt = Integer.toString(b);

        abc = at+bt;

        answer = 2 * a * b;

        int abc_i = Integer.parseInt(abc);

        if (answer <= abc_i) {
            System.out.println(abc_i);
        } else {
            System.out.println(answer);
        }

    }
}
