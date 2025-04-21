package chapter05;
import java.util.Scanner;
import java.util.Calendar;

public class LAB_chapter_05_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---피시방 출입 제한 공지---");
        System.out.print("출생년도 입력(4자리 정수로): ");
        int birthYear=sc.nextInt();

        Calendar calender=Calendar.getInstance();       //getInstance: 현재 시간/날짜 정보를 가진 Calendar 객체를 만들어주는 정적 메서드, 현재를 대입함
        int nowYear=calender.get(Calendar.YEAR);

        int age=nowYear-birthYear;

        if(age>=18){
            System.out.println("즐거운 시간 보내세요");
        }else System.out.println("집에 가실 시간입니다");

        System.out.println("협조해주셔서 감사합니다");
    }
}
