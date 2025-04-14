package chapter04;

public class DataTypeTest {
    public static void main(String[] args){
        //숫자가 아닌 자료형 : boolean, char
        boolean boo1 = false;
        boolean boo2 = 100>200;     //false
        boolean boo3=!boo1;

        char ch1='A';
        char ch2=97;

        System.out.println("ch1 "+ ch1);
        System.out.println("ch2 "+ ch2);
        System.out.println("ch1 + 3: " + (char)(ch1+3));

        //숫자 자료형
        //정수형: byte(8비트),short(16비트),int(32비트),long(64비트)

        //byte byte1=128;     //overflow로 인한 에러
        byte byte2=127;
        byte byte3=-128;
        //byte byte4=-129;    //underflow로 인한 에러
        System.out.println(byte2);
        System.out.println(byte3);

        short short1=128;
        //byte4=short-1;

        int int1=byte2;
        int int2=short1;
        int int3=1000001100;

        long long1=byte2;
        long long2=short1;
        long long3=int1;
        long long4=(long)Math.pow(10,100);
        System.out.println("long: " + long4);

        //실수형: float,double
        float float1=123.456f;
        float float2=(float)123.456;

        double double1=123.456;
        double double2=float1;
        double double3=byte2;

        //팜조형 : 클래스, 인터페이스
        String str1=new String("gek");
        str1="heello";
        String str2=new String("gek");

        boolean bool4 =str1==str2;          //String 객체가 생성 될 때 주소 값이 달라서 false로 나온다. 안에 있는 텍스트를 비교하는 게 아니라 주소 값을 비교하는 거
        System.out.println(bool4);
        System.out.println(str1.equals(str2));          //equals는 주소 값을 비교하는 게 아니라 스트링 내에 있는 문자값을 비교
    }
}
