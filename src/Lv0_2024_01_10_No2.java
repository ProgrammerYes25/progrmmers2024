//제목 : 배열 만들기 2
//  문제 설명
//    정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//    만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
//  제한사항
//    1 ≤ l ≤ r ≤ 1,000,000
//
//  입출력 예
//    l	 r	result
//    5	555	[5, 50, 55, 500, 505, 550, 555]
//   10	20	[-1]
//
// 입출력 예 설명
//  입출력 예 #1
//    5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
//  입출력 예 #2
//    10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv0_2024_01_10_No2 {
    public int[] solution(int l, int r) {

        List<Integer> ans = new ArrayList<Integer>();
        for(int i = l; i <=r; i++){
            for(int k = 1; k<=5 ;k*=5) {
                int num = i*k;
                if(num <= r) {
                    String str = Integer.toString(num);
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) != '0' && str.charAt(j) != '5') {
                            break;
                        } else if (j == str.length() - 1) {
                            boolean tf = true;
                            for (int a = 0; a < ans.size(); a++) {
                                if (ans.get(a).equals(num)) {
                                    tf = false;
                                }
                            }
                            if (tf) {
                                ans.add(num);
                            }
                        }
                    }
                }
            }
        }

        if(ans.size()==0){
            ans.add(-1);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv0_2024_01_10_No2 s = new Lv0_2024_01_10_No2();
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] arrans = s.solution(l, r);
        for (int i : arrans) {
            System.out.print(i + ",");
        }
    }
}