public class test2 {
    public String solution(String ss, int[][] interval) {
        String answer = "";

        int len = ss.length();
        String[] s_str = ss.split("");
        String[] str = new String[len];

        for (int i = 0; i < interval.length; i++) {
            int st = interval[i][0];
            int ed = interval[i][1];

            for (int j = 0; j <= ed-st; j++) {
                str[ed-j] = s_str[st+j];
            }
            for (int j = 0; j <= ed-st; j++) {
                s_str[st+j] = str[st+j];
            }

        }
        for (int i = 0; i < len; i++) {
            answer += s_str[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }

}
