package chapter02;
import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("받는 사람 :");
        String name=s.next();
        System.out.println("주소 :");
        String ad=s.next();
        System.out.println("무게 :");
        int weight=s.nextInt();

        System.out.println("받는 사람 =>" + name);
        System.out.println("주소 =>" + ad);
        System.out.println("가격 =>" + weight * 5 + "원");

        s.close();
    }
}
