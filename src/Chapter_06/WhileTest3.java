package Chapter_06;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int total=0;
        int num1,num2;

        System.out.println("--무한 루프 덧셈--");

        while(true){
            System.out.print("첫 번째 숫자 입력(0 입력시 종료): ");
            num1=sc.nextInt();
            if(num1==0)
                break;

            System.out.print("두 번째 숫자 입력: ");
            num2=sc.nextInt();

            total=num1+num2;
            System.out.print("합계: "+total+"\n");
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}
