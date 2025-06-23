package chapter08.section3;

public class RabbitTest {
    public static void main(String[] args)
    {
        HouseRabbit h=new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.move(10,20);
        m.move(12,45);

        h.shape="Holly";
        h.eat("grape");
    }
}
