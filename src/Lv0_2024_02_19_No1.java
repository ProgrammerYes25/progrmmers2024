//제목 : 5명씩
//  문제 설명
//    최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
//  제한사항
//    5 ≤ names의 길이 ≤ 30
//    1 ≤ names의 원소의 길이 ≤ 10
//    names의 원소는 영어 알파벳 소문자로만 이루어져 있습니다.
//  입출력 예
//                       names                                  	result
//   ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]	["nami", "vex"]
//
// 입출력 예 설명
//  입출력 예 #1
//    앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다. ["nami", "ahri", "jayce", "garen", "ivern"], ["vex", "jinx"] 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.

import java.util.Scanner;

public class Lv0_2024_02_19_No1 {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length%5==0)?(names.length/5):(names.length/5)+1];
        int j = 0;
        for(int i = 0; i < names.length; i+=5){
            answer[j++] = names[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv0_2024_02_19_No1 s = new Lv0_2024_02_19_No1();
        Scanner sc = new Scanner(System.in);
        String[] str = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "dion", "dk", "venon"};
        String[] arrans = s.solution(str);
        for(String i : arrans){
            System.out.print(i + ",");
        }
    }
}