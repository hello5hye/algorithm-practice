public class test2 {

    // 문자열 ss에서 interval 배열에 주어진 구간별로 문자열을 뒤집는 문제
    public String solution(String ss, int[][] interval) {
        String answer = ""; // 결과 문자열

        int len = ss.length(); // 원본 문자열의 길이
        String[] s_str = ss.split(""); // 원본 문자열을 한 문자씩 나눠 배열에 저장
        String[] str = new String[len]; // 영역별로 뒤집을 문자를 임시로 저장할 배열

        // interval을 순회하며 각 구간별로 문자열 뒤집기를 진행
        for (int i = 0; i < interval.length; i++) {
            int st = interval[i][0]-1;  // 시작 인덱스
            int ed = interval[i][1]-1;  // 끝 인덱스

            // 뒤집을 문자를 str 배열에 임시로 저장 (뒤부터 저장)
            for (int j = 0; j <= ed-st; j++) {
                str[ed-j] = s_str[st+j];
            }

            // 임시로 저장한 str 배열에서 문자를 꺼내 s_str 배열의 해당 인덱스에 뒤집어 저장
            for (int j = 0; j <= ed-st; j++) {
                s_str[st+j] = str[st+j];
            }

        }
        // 최종 결과 문자열 만들기
        for (int i = 0; i < len; i++) {
            answer += s_str[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }

}
