package chapter02;
import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);     //Scanner은 입력을 처리할 수 있는 클래스. sc는 Scanner 객체의 변수명.
                                                //new Scanner(System.in)는 키보드로부터 데이터를 읽을 수 있는 Scanner 객체를 새로 생성함
                                                //즉 생성된 객체의 주소 값을 반환 받아서 s라는 객체 참조 변수에 대입했다
        Scanner sc1 = new Scanner(System.in);   //문자열 입력 받기 위한 Scanner

        System.out.println("정수값 입력:");
        int num2 = sc.nextInt();
        System.out.println("사용자가 입력한 값:" + num2);

        System.out.println("실수값 입력:");
        float num1=sc.nextFloat();  //사용자가 데이터를 입력하기 전까지 커서가 깜빡 거린다
        System.out.println("사용자가 입력한 값:" + num1);

        System.out.println("성명 입력:");
        String name=sc1.nextLine();  //String으로 받을 땐 sc.next()나 sc.nextLine() 사용, sc.nextLine() 사용할 땐 다른 스캐너를 생성해서 받는 게 좋다
        System.out.println("사용자가 입력한 이름:" + name);

        sc.close();     //scanner 사용을 중지하고 값을 반환하기 위해서
        sc1.close();
    }
}
