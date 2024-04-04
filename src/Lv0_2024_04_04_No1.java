//제목 : 정수 부분
//  문제 설명
//    실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
//  제한사항
//    0 ≤ flo ≤ 100
//  입출력 예
//    flo	result
//    1.42	1
//    69.32	69
// 입출력 예 설명
//  입출력 예 #1
//    1.42의 정수 부분은 1입니다.
//  입출력 예 #2
//    69.32의 정수 부분은 69입니다.

import java.util.Scanner;

public class Lv0_2024_04_04_No1 {
    public int solution(double flo) {
        int answer = (int) Math.floor(flo);
        return answer;
    }
    public static void main(String[] args) {
        Lv0_2024_04_04_No1 s = new Lv0_2024_04_04_No1();
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int arrans = s.solution(d);
        System.out.print(arrans + ",");
    }
}
