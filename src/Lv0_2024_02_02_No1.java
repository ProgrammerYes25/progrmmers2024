
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