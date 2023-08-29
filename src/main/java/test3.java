import java.util.ArrayList;

public class test3 {

    public int solution(int n, int m) {
        int answer = 0; // 팰린드롬 숫자를 세기 위한 변수

        ArrayList<String> stral = new ArrayList<String>();  // 숫자를 문자열로 저장할 ArrayList


        // n부터 m까지 숫자를 문자열로 변환해 ArrayList에 추가
        for (int i = n; i <= m; i++) {
            stral.add(Integer.toString(i));
        }


        // ArrayList에 있는 문자열을 순회하며 팰린드롬인지 확인
        for (int j = 0; j < stral.size(); j++) {
            int st = 0; //start 왼쪽에서 오른쪽으로 이동.
            int ed = stral.get(j).length() - 1; // end 오른쪽에서 왼쪽으로 이동.

            //  서로 만났거나 교차했는지 확인
            while (true) {
                st++; // 포인터 이동..
                ed--;

                if (st >= ed) {
                    if (stral.get(j).charAt(st) == stral.get(j).charAt(ed)) {
                        answer++; // 팰린드롬이면 answer 값 증가
                        break;
                    } else {
                        break;

                    }
                }
            }


        }
        return answer;
    }
}