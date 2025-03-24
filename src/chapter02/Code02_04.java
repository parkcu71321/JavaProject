package chapter02;

public class Code02_04 {                //자바의 기본 단위는 class
    public static void main(String[] args){
        int a=10;                   //=는 대입연사자로 오른쪽 값을 왼쪽으로 대입한다라는 뜻임
        int b=20;
        int c=a+b;

        System.out.println(c);          //println은 출력 후 줄바꿈

        System.out.println(a+"+"+b+"="+c);

        System.out.printf("%d+%d=%d\n",a,b,c);


        int result=b-a;

        System.out.println(result);
        System.out.printf("%d-%d=%d\n",b,a,result);

        int num1=50;
        int num2=100;
        result=num1*num2;
        System.out.println(result);
        System.out.printf("%d*%d=%d\n",num1,num2,result);

        result=num1/num2;
        System.out.println(result);

        result=num2/num1;
        System.out.printf("%d/%d=%d\n",num2,num1,result);
    }
}
