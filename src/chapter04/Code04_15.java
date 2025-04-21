package chapter04;

public class Code04_15 {
    public static void main(String[] args){
        String str="난생처음 자바를 처음 학습 중입니다.자바는 처음이지만 재미있네요";
        System.out.println(str.indexOf("처음"));

        System.out.println(str.indexOf("처음",6));
        System.out.println(str.indexOf("처음",11));

        String str1="java";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));
        //System.out.println(str1.charAt(4));

        System.out.println(str1.substring(1,3));
    }
}
