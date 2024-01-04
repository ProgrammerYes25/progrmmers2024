//제목 : 문자열 곱하기
//  문제 설명
//    문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
//  제한사항
//    1 ≤ my_string의 길이 ≤ 100
//    my_string은 영소문자로만 이루어져 있습니다.
//    1 ≤ k ≤ 100
//
//  입출력 예
//    my_string	  k	  result
//     "string"	  3	  "stringstringstring"
//      "love"	  10  "lovelovelovelovelovelovelovelovelovelove"
//
// 입출력 예 설명
//  입출력 예 #1
//    예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.
//  입출력 예 #2
//    예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.


import java.util.Scanner;

public class Lv0_2024_01_04_No3 {
    public String solution(String my_string, int k) {
        String answer = my_string;
        for(int i = 1; i < k; i++){
            answer +=my_string;
        }
        return answer;
    }
    public static void main(String[] args){
        Lv0_2024_01_04_No3 s = new Lv0_2024_01_04_No3();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int k = sc.nextInt();
        String str = s.solution(str1, k);
        System.out.print(str);
    }
}
