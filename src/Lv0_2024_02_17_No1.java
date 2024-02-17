//제목 : n개 간격의 원소들
//  문제 설명
//    정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//  제한사항
//    5 ≤ num_list의 길이 ≤ 20
//    1 ≤ num_list의 원소 ≤ 9
//    1 ≤ n ≤ 4
//  입출력 예
//       num_list    	n	result
//   [4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
//   [4, 2, 6, 1, 7, 6]	4	[4, 7]
//
// 입출력 예 설명
//  입출력 예 #1
//    [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
//  입출력 예 #2
//    [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv0_2024_02_17_No1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i+=n){
            list.add(num_list[i]);
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv0_2024_02_17_No1 s = new Lv0_2024_02_17_No1();
        Scanner sc = new Scanner(System.in);
        int[] str = {5, 2, 1, 7, 5 };
        int n = sc.nextInt();
        int[] arrans = s.solution(str, n);
        for(int i : arrans){
            System.out.print(i + ",");
        }
    }
}