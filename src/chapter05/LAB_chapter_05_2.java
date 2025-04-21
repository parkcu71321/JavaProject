package chapter05;
import java.util.Scanner;

public class LAB_chapter_05_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("내 수: ");
        String my=sc.nextLine();

        String comarr[]={"가위","바위","보"};
        int comnum=(int)(Math.random()*comarr.length);          //Math.random() : 0.0~1.0까지의 숫자 중 무작위로 하나의 수를 뽑음
        String com=comarr[comnum];
        System.out.println("컴퓨터의 수: " + com);

        if(my.equals("가위")){
            if(com.equals("가위")) System.out.println("비겼습니다");
            if(com.equals("바위")) System.out.println("졌습니다");
            if(com.equals("보")) System.out.println("이겼습니다");
        }
        else if(my.equals("바위")){
            if(com.equals("가위")) System.out.println("이겼습니다");
            if(com.equals("바위")) System.out.println("비겼습니다");
            if(com.equals("보")) System.out.println("졌습니다");
        }
        else if(my.equals("보")){
            if(com.equals("가위")) System.out.println("이겼습니다");
            if(com.equals("바위")) System.out.println("비겼습니다");
            if(com.equals("보")) System.out.println("비겼습니다");
        }else System.out.println("가위,바위,보 중 하나를 입력하세요");

    }
}
