package Chapter_06;

public class DiceGame {
    public static void main(String[] args){
        int count=0;
        int num1=0,num2=0,num3=0;

        while(true)
        {
            count++;
            num1=(int)(Math.random()*6+1);          //1<=ran<7. 즉 1부터 6까지의 정수
            num2=(int)(Math.random()*6+1);
            num3=(int)(Math.random()*6+1);

            if((num1==num2) && (num2==num3))
                break;
        }
        System.out.println("3개의 숫자가 같이질 때까지 던진 주사휘 횟수: "+count);
        System.out.printf("3개의 숫자는 모두 %d",num1);
    }
}
