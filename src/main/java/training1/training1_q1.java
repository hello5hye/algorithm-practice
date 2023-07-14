package training1;

// 연습 문제 1
public class training1_q1 {

    // a, b, c, d의 최댓값을 구하여 반환
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    // 세 값의 최솟값
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }

    //네 값의 최솟값
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;

        return min;
    }

    public static void main(String[] args) {

        System.out.println("max4 (3, 2, 1, 5) = " + max4(3, 2, 1, 5));
        System.out.println("min3 (6, 2, 5) = " + min3(6, 2, 8));
        System.out.println("max4 (3, 2, 1, 5) = " + min4(3, 2, 1, 5));

    }
}
