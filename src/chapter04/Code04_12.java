package chapter04;

public class Code04_12 {
    public  static void main(String[] agrs){
        String str="Hello World";
        System.out.println(str.toUpperCase());          //str 안에 있는 문자를 바꾸는 게 대문자로 변환 값을 str에 대입하는 거다

        System.out.println(str.toLowerCase());          //str 안에 있는 문자를 바꾸는 게 소문자로 변환 값을 str에 대입하는 거다

        String str2="   AIsoftware    Seoul   ";
        System.out.println(str2);
        String str3=str2.trim();                //trim()은 앞 뒤 공백만 지워지고 문자 가운데 공백은 제거되지 않는다
        System.out.println(str3);
    }
}
