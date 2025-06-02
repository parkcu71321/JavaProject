package Chapter_06;

import java.util.Scanner;

public class ComputerGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int user,computer;          //사용자 입력 값, 컴퓨터 랜덤 값

        for(int i=0; i<10; i++)
        {
            System.out.printf("게임 %d회: 컴퓨터가 생각한 숫자는(1~5 내에서)? ",i+1);
            computer=(int)(Math.random()*5+1);
            user=sc.nextInt();

            if(computer==user)
            {
                System.out.println("정답입니다 !");
                break;
            }
            else
            {
                System.out.printf("컴퓨터가 생각한 숫자는 %d였습니다. ㅠㅠ\n",computer);
            }
        }
        System.out.println("게임 종료.");

        sc.close();
    }
}
