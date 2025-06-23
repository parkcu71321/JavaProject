package chapter08.Lab_section2;
import java.util.Scanner;

public class CarTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speedUp;

        SportCar sportcar = new SportCar();
        Bus bus = new Bus();
        
        while(true)
        {


            System.out.print("가속할 속도(-1 입력시 종료) ==> ");
            speedUp = sc.nextInt();

            if(speedUp==-1)
            {
                break;
            }


            sportcar.SpeedUp(speedUp);
            System.out.println("** 현재 스포츠카의 속도: " + sportcar.getSpeed());


            bus.SpeedUp(speedUp);
            System.out.println("** 현재 버스의 속도: " + bus.getSpeed());
        }
    }
}
