//제목 : 간단한 논리 연산
//  문제 설명
//    boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//    (x1 ∨ x2) ∧ (x3 ∨ x4)
//  입출력 예
//    x1	 x2	      x3	x4  	result
//   false	true	true	true	true
//   true	false	false	false	false
// 입출력 예 설명
//  입출력 예 #1
//    예제 1번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
//    (x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T
//    따라서 true를 return 합니다.
//  입출력 예 #2
//    예제 2번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
//    (x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (T ∨ F) ∧ (F ∨ F) ≡ T ∧ F ≡ F
//    따라서 false를 return 합니다.
//    ∨과 ∧의 진리표는 다음과 같습니다.
//
//    x	y	x ∨ y	x ∧ y
//    T	T    T        T
//    T	F	 T	      F
//    F	T	 T	      F
//    F	F	 F        F


import java.util.Scanner;

public class Lv0_2024_01_15_No1 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_01_15_No1 s = new Lv0_2024_01_15_No1();
        Scanner sc = new Scanner(System.in);
        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();
        boolean x4 = sc.nextBoolean();
        boolean arrans = s.solution(x1, x2, x3, x4);
        System.out.println(arrans);
    }
}