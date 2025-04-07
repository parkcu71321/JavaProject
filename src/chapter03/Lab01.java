package chapter03;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("파운드를 입력하세요 :");
        double pound=0.453592;
        int num1=sc.nextInt();
        System.out.printf("%d 파운드는 %f 킬로그램입니다\n",num1,pound*num1);


        System.out.println("킬로그램을 입력하세요");
        double kg=2.204623;
        int num2=sc.nextInt();
        System.out.printf("%d 킬로그램은 %f 파운드입니다",num2,kg*num2);

        sc.close();
    }
}
