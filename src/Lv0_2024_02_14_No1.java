//제목 : n 번째 원소부터
//  문제 설명
//    정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//  제한사항
//    2 ≤ num_list의 길이 ≤ 30
//    1 ≤ num_list의 원소 ≤ 9
//    1 ≤ n ≤ num_list의 길이
//  입출력 예
//    num_list      	n	result
//   [2, 1, 6]      	3	[6]
//   [5, 2, 1, 7, 5]	2	[2, 1, 7, 5]
//
// 입출력 예 설명
//  입출력 예 #1
//    [2, 1, 6]의 세 번째 원소부터 마지막 원소까지의 모든 원소는 [6]입니다.
//  입출력 예 #2
//    [5, 2, 1, 7, 5]의 두 번째 원소부터 마지막 원소까지의 모든 원소는 [2, 1, 7, 5]입니다.


import java.util.Scanner;

public class Lv0_2024_02_14_No1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        int index = 0;
        for(int i = n-1; i < num_list.length; i++){
            answer[index++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_02_14_No1 s = new Lv0_2024_02_14_No1();
        Scanner sc = new Scanner(System.in);
        int[] i1 = {0, 1, 2, 3, 4, 5};
        int i2 = sc.nextInt();
        int[] arrans = s.solution(i1, i2);
        for(int i : arrans){
            System.out.print(i + ",");
        }
    }
}