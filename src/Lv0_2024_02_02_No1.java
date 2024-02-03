//제목 : qr code
//  문제 설명
//    두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//  제한사항
//    0 ≤ r < q ≤ 20
//    r < code의 길이 ≤ 1,000
//    code는 영소문자로만 이루어져 있습니다.
//
//  입출력 예
//     q	r       	code    	result
//     3	1	"qjnwezgrpirldywt"	"jerry"
//     1	0	"programmers"   	"programmers"
// 입출력 예 설명
//  입출력 예 #1
//    예제 1번의 q와 r은 각각 3, 1이고 인덱스와 그 값을 q로 나눈 나머지가 잘 보이도록 표로 만들면 다음과 같습니다.
//      code	q	j	n	w	e	z	g	r	p	i	r	l	d	y	w	t
//     index	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15
//q로 나눈 나머지	0	1	2	0	1	2	0	1	2	0	1	2	0	1	2	0
//    q로 나눈 나머지가 1인 인덱스의 문자들을 앞에서부터 순서대로 이어 붙이면 "jerry"가 되므로 이를 return 합니다.
//  입출력 예 #2
//    예제 2번의 q와 r은 각각 1, 0이고 인덱스와 그 값을 q로 나눈 나머지가 잘 보이도록 표로 만들면 다음과 같습니다.
//      code	p	r	o	g	r	a	m	m	e	r	s
//     index	0	1	2	3	4	5	6	7	8	9	10
//q로 나눈 나머지	0	0	0	0	0	0	0	0	0	0	0
//    q로 나눈 나머지가 1인 인덱스의 문자들을 앞에서부터 순서대로 이어 붙이면 "programmers"가 되므로 이를 return 합니다.

import java.util.Scanner;

public class Lv0_2024_02_02_No1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            int index = ch>='a'?(int)ch-6-65:(int)ch-65;
            answer[index]+=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_2024_02_02_No1 s = new Lv0_2024_02_02_No1();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int[] arrans = s.solution(str1);
        for(int i : arrans){
            System.out.print(i + ",");
        }

    }
}