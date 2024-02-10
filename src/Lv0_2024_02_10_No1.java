//제목 : 2의 영역
//  문제 설명
//    정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//    단, arr에 2가 없는 경우 [-1]을 return 합니다.
//  제한사항
//    1 ≤ arr의 길이 ≤ 100,000
//    1 ≤ arr의 원소 ≤ 10
//  입출력 예
//             arr          	result
//    [1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
//         [1, 2, 1]        	[2]
//         [1, 1, 1]        	[-1]
//[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
//
// 입출력 예 설명
//  입출력 예 #1
//    2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.


public class Lv0_2024_02_10_No1 {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int start=-1, end=arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==2){
                if(start==-1){
                    start=i;
                }
                end = i;
            }
        }
        if(start!=-1){
            answer = new int[end+1-start];
            int j = 0;
            for(int i = start; i <= end; i++){
                answer[j++] = arr[i];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_02_10_No1 s = new Lv0_2024_02_10_No1();
        int[] i1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arrans = s.solution(i1);
        for(int i : arrans){
            System.out.print(i + ",");
        }
    }
}