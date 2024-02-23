//제목 : 수열과 구간 쿼리 1
//  문제 설명
//    정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
//    각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
//    위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//  제한사항
//    1 ≤ arr의 길이 ≤ 1,000
//    0 ≤ arr의 원소 ≤ 1,000,000
//    1 ≤ queries의 길이 ≤ 1,000
//    0 ≤ s ≤ e < arr의 길이
//  입출력 예
//           arr        	queries          	result
//    [0, 1, 2, 3, 4]	[[0, 1],[1, 2],[2, 3]]	[1, 3, 4, 4, 4]
//
// 입출력 예 설명
//  입출력 예 #1
//    각 쿼리에 따라 arr가 다음과 같이 변합니다.
//     i	queries[i]	arr
//     -	-       	[0, 1, 2, 3, 4]
//     0	[0,1]    	[1, 2, 2, 3, 4]
//     1	[1,2]    	[1, 3, 3, 3, 4]
//     2	[2,3]   	[1, 3, 4, 4, 4]
//    따라서 [1, 3, 4, 4, 4]를 return 합니다.

import java.util.Arrays;

public class Lv0_2024_02_22_No1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int j = 0; j < queries.length; j++){
            int s = queries[j][0], e = queries[j][1];
            for(int i = 0; i < arr.length; i++){
                if(s <= i && i <= e){
                    answer[i]+=1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Lv0_2024_02_22_No1 s = new Lv0_2024_02_22_No1();
        int[] il = {0, 1, 2, 3, 4};
        int[][] il2 = {{0, 1},{1, 2},{2, 3}};
        int[] arrans = s.solution(il, il2);
        for(int i : arrans){
            System.out.print(i + ",");
        }
    }
}