package chapter02;

public class Code02_08 {
    public static void main(String[] args){
        String str1="난생처음";             //main 메서드 안에서만 쓸 수 있는 지역변수임, 지역 변수는 초기화 시켜야함
        String str2="자바";
        System.out.println(str1+str2);
        String result=str1+str2;
        System.out.println(result);
    }
}
