package chapter02;

public class Code02_09 {
    public static void main(String[] args){
        int num1=10, num2=20;                   //지역 변수는 초기화를 시켜야함
        double result;                      //double : 실수형

        result=num1+num2;
        System.out.printf("%d+%d=%.0f\n",num1,num2,result);             //%f는 실수를 나타낼 때 사용. %.2f는 소수 둘째 자리까지 표기

        result=num1/(double)num2;       //정수/정수 = 정수,  (자료형)변수 : 지정됐던 변수의 자료형을 (자료형)으로 바꿀 수 있다.
        System.out.printf("%d/%d=%.2f",num1,num2,result);

    }
}
