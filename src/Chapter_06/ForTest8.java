package Chapter_06;

public class ForTest8 {
    public static void main(String[] args){
        for(int i=2; i<10; i++)
        {
            System.out.print("**"+i+"단"+"**\t");
            for (int j = 1; j < 10; j++)
                System.out.print(i + " * " + j + " = " + (i * j)+"\t");
            System.out.println();
        }
    }
}
