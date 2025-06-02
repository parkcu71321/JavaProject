package Chapter_06;

public class ContinueTest {
    public static void main(String[] args){
        int total=0;

        for(int i=1; i<=100; i++)
        {
            if(i%5==0)
                continue;
            total+=i;
        }
        System.out.println("5의 배수를 제외한 1부터 100까지의 합계: "+total);
    }
}
