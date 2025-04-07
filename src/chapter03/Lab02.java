package chapter03;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("체중을 입력해주세요 :");
        double weight=sc.nextDouble();
        System.out.println("키를 입력해주세요 :");
        double height=sc.nextDouble();

        double bmi=weight/Math.pow((height/100),2);
        System.out.printf("체중은 %.1f이고, 키는 %.1f이므로 당신의 BMI는 %.2f입니다.",weight,height,bmi);
    }
}
