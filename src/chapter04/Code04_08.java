package chapter04;

public class Code04_08 {
    public static void main(String[] args){
        String str1="한국폴리텍대학\n인공지능소프트웨어\n1학년";
        System.out.println(str1);

        String str2="polytech\t\"aisofware\"\tholly";      //""를 집어넣고 싶을 때 \" \"를 사용한다
        System.out.println(str2);

        String str3="한국 폴리텍";
        System.out.println(str3);
        System.out.println(str3.length());              //변수 안에 있는 길이를 잰다. 띄어쓰기도 포함
    }
}
