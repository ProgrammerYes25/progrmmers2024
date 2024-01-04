//제목 :문자 리스트를 문자열로 변환하기
//  문제 설명
//    문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
//  제한사항
//    1 ≤ arr의 길이 ≤ 200
//    arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
//
//  입출력 예
//          arr	   result
//    ["a","b","c"]	"abc"


import java.util.Scanner;

public class Lv0_2024_01_04_No2 {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
    public static void main(String[] args){
        Lv0_2024_01_04_No2 s = new Lv0_2024_01_04_No2();
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }
        String str = s.solution(arr);
        System.out.print(str);
    }
}
