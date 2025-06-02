package Chapter07.rabit;
import java.util.Scanner;

public class RabbitLab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rabbit rabbit = new Rabbit();

        int x,y;

        for(int i=0; i<5; i++){
            System.out.print("x좌표를 입력하세요: ");
            x=sc.nextInt();
            System.out.print("y좌표를 입력하세요: ");
            y=sc.nextInt();
            rabbit.setPosition(x,y);
            rabbit.move();
            System.out.println();
        }
    }
}
