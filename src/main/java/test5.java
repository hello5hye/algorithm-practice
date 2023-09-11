import java.util.Scanner;

public class test5 {

    // ㅁ문자 반복하기
    public static void main(String[] args) {
        // String 및 StringBuilder 호출
        String str = "Hello";
        StringBuilder sb = new StringBuilder();

        // 반복문을 사용하여 문자열 반복
        for(int i = 0; i < 3; i++)
        {
            sb.append(str);
        }

        // 결과 출력 -> for문
        System.out.println("for문 : " + sb); //for문 : HelloHelloHello

        String re = solution(str, 3);
        System.out.println("solution 메서드 : " + re);
    }

    public static String solution(String my_string, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <  k; i++) {
            sb.append(my_string);

        }
        answer = sb.toString(); // StringBuilder를 문자열로 변환 후 대입

        return answer;
    }


}
