//제목 : 배열 만들기 1
//  문제 설명
//    정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//  제한사항
//    1 ≤ n ≤ 1,000,000
//    1 ≤ k ≤ min(1,000, n)
//  입출력 예
//     n	k	result
//    10	3	[3, 6, 9]
//    15	5	[5, 10, 15]
// 입출력 예 설명
//  입출력 예 #1
//    1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
//  입출력 예 #2
//    1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv0_2024_02_03_No1 {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%k == 0){
                arr.add(i);
            }
        }
        answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_02_03_No1 s = new Lv0_2024_02_03_No1();
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int[] arrans = s.solution(i1, i2);
        for(int i : arrans){
            System.out.print(i + ",");
        }

    }
}