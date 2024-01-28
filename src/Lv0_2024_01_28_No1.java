//제목 : 문자열의 앞의 n글자
//  문제 설명
//    문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
//  제한사항
//    my_string은 숫자와 알파벳으로 이루어져 있습니다.
//    1 ≤ my_string의 길이 ≤ 1,000
//    1 ≤ n ≤ my_string의 길이
//
//  입출력 예
//    my_string     	n   	result
//    "ProgrammerS123"	11	"ProgrammerS"
//      "He110W0r1d"	5	"He110"
// 입출력 예
//  입출력 예 #1
//    예제 1번의 my_string에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.
//  입출력 예 #2
//    예제 2번의 my_string에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.  예제 2번의 my_string는 "programmers"이고 모든 접미사는 "programmers", "rogrammers", "ogrammers", "grammers", "rammers", "ammers", "mmers", "mers", "ers", "rs", "s"입니다. 이를 사전순으로 정렬한 문자열 배열 ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]를 return 합니다.

import java.util.Scanner;

public class Lv0_2024_01_28_No1 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_01_28_No1 s = new Lv0_2024_01_28_No1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();

        String arrans = s.solution(str, i);
        System.out.print(arrans + ",");
    }
}