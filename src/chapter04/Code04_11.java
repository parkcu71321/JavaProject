package chapter04;
import java.util.Scanner;

public class Code04_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 문자 입력 :");
        String str1=sc.nextLine();

        System.out.print("두 번째 문자 입력 :");
        String str2=sc.nextLine();

        int diff=str1.length() - str2.length();
        System.out.println("두 문자의 차: "+diff);

        sc.close();
    }
}
