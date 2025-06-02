package Chapter_06;

public class ForTest5 {
    public static void main(String[] args){
        int total=0;

        for(int i=500; i<=1000; i++)
        {
            if(i%2==0)
                total+=i;
        }
        //for(int=500; i<=1000; i+=2)도 가능
        System.out.println("500부터 1000사이 짝수의 합: "+total);
    }
}
