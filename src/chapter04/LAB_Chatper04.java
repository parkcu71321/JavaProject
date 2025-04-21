package chapter04;

public class LAB_Chatper04 {
    public static void main(String[] args){
        String str="블랙핑크";
        System.out.println();
//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }

//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(str.length()-(i+1)));
//        }

        String str1="Java";
        String change="";

        change=str1.substring(0,1).toUpperCase();
        change=change+str1.substring(1,2);
        change=change+str1.substring(2,3);
        change=change+str1.substring(3,4);

        System.out.println(change);
    }
}
