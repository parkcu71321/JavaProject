package chapter05;
import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("짝/홀 게임");
        System.out.println("숫자를 입력하세요: ");

        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("짝수입니다 !~");
        }
        else
            System.out.println("홀수입니다 !~");

        sc.close();
    }
}
