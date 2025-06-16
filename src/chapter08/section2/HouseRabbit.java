package chapter08.section2;

public class HouseRabbit extends Rabbit
{
    String ownerName;

    HouseRabbit()
    {
        super();
        System.out.println("HouseRabbit 생성자");
    }

    void eat()
    {
        System.out.println("집토끼 개꿀");
    }

    @Override
    void move(int x, int y)
    {
        if(x>100) this.x=100;
        if(y>100) this.y=100;

        System.out.printf("(%d,%d)로 이동\n",this.x,this.y);
    }
}
