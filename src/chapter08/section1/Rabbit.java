package chapter08.section1;

public class Rabbit
{
    String shape;
    int x,y;
    static int count;

    Rabbit()
    {
        count++;
    }

    void countCheck()
    {
        System.out.println("토끼의 수는: "+count);
    }
}
