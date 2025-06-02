package Chapter_06;

public class ForTest3 {
    public static void main(String[]args){
        int possible=1;

        for(int i=1; i<=7; i++)
        {
            possible*=i;
        }
        System.out.print(possible);
    }
}
