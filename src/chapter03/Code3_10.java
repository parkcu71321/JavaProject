package chapter03;
import java.util.Scanner;
public class Code3_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("시험 점수를 입력하세요 :");

        int score=sc.nextInt();
        String result="";
        if(score>=70){
            result="합격";
        }
        else result="불합격";
        System.out.println("결과 :  "+result);
    }
}
