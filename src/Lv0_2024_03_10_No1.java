//제목 : x 사이의 개수
//  문제 설명
//    문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//  제한사항
//    1 ≤ myString의 길이 ≤ 100,000
//    myString은 알파벳 소문자로 이루어진 문자열입니다.
//  입출력 예
//    myString  	result
//  "oxooxoxxox"	[1, 2, 1, 0, 1, 0]
//  "xabcxdefxghi"	[0, 3, 3, 3]
// 입출력 예 설명
//  입출력 예 #1
//    "x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다. 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.
//  입출력 예 #2
//    "x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다. 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.

import java.util.Scanner;

public class Lv0_2024_03_10_No1 {
    public int[] solution(String myString) {
        if (myString.charAt(0) == 'x'){
            myString = 1+myString;
        }
        if(myString.endsWith("x")){
            myString += "1";
        }
        String[] strarr = myString.split("x");
        int[] answer = new int[strarr.length];
        for(int i = 0; i < strarr.length; i++){
            if(strarr[i].equals("1")){
                answer[i] = 0;
            }else{
                answer[i] = strarr[i].length();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_03_10_No1 s = new Lv0_2024_03_10_No1();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int[] arrans = s.solution(str1);
        for(int a : arrans){
            System.out.print(a+",");
        }
    }
}