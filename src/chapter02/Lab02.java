package chapter02;
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 단순 계산기 =====");
        System.out.println("값 입력:\t");
        int num1=sc.nextInt();
        System.out.println("정수1:\t"+num1);

        System.out.println("값 입력:\t");
        int num2=sc.nextInt();
        System.out.println("정수2:\t"+num2);

        float a=(float)num1/num2;

        System.out.println("--------- 계산 결과 ----------");

        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(a));
        System.out.println(num1+"%"+num2+"="+(num1%num2));
    }
}
