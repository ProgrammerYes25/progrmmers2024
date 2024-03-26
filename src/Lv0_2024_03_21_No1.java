//제목 : 배열 만들기 6
//  문제 설명
//    0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
//    i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
//    만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//    stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
//    stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
//    위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
//    단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
//  제한사항
//    1 ≤ arr의 길이 ≤ 1,000,000
//    arr의 원소는 0 또는 1 입니다.
//  입출력 예
//    arr        	result
//  [0, 1, 1, 1, 0]	[0, 1, 0]
//  [0, 1, 0, 1, 0]	[0, 1, 0, 1, 0]
//  [0, 1, 1, 0]	[-1]
//
// 입출력 예 설명
//  입출력 예 #1
//    각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.
//    idx	arr[idx]	stk
//    0    	0        	[]
//    1    	1        	[0]
//    2    	1        	[0, 1]
//    3    	1        	[0]
//    4    	0        	[0, 1]
//    5	    -        	[0, 1, 0]
//    따라서 [0, 1, 0]을 return 합니다.

import java.util.ArrayList;
import java.util.List;

public class Lv0_2024_03_21_No1 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk  = new ArrayList<Integer>();
        int i = 0;
        int len = stk.size();
        while (i < arr.length){
            if(len==0){
                stk.add(arr[i]);
            } else if(stk.get(len-1) == arr[i]){
                stk.remove(len-1);
            } else if(stk.get(len-1) != arr[i]){
                stk.add(arr[i]);
            }
            i++;
            len = stk.size();
        }
        if(len==0){
            return answer= new int[]{-1};
        }
        answer = new int[len];
        for(int j = 0; j < answer.length; j++){
            answer[j] = stk.get(j);
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv0_2024_03_21_No1 s = new Lv0_2024_03_21_No1();
        int[] iarr = {0, 1, 1, 1, 0};
        int[] arrans = s.solution(iarr);
        for(int i : arrans){
            System.out.print(i + ",");
        }
    }
}