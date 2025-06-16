package chapter08.section2;

public class RabbitTest
{
    public static void main(String[] args)
    {
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.ownerName="스꾸삐";
        h.move(50,40);
        h.eat();
        h.shape="동그라미";

        m.ownerName="스컬";
        m.move(60,40);
        m.eat();
        m.shape="세모";


    }
}
