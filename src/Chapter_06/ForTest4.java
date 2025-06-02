package Chapter_06;

public class ForTest4 {
    public static void main(String[]args) {
        int total = 0;

        for (int i = 1000; i < 2000; i++) {
            if(i%2==1)
            {
                total += i;
            }
        }
        System.out.println("\n" + total);
    }
}
