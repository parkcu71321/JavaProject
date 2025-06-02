package Chapter07.rabit;

public class RabbitTest {
    public static void main(String[] args){
        Rabbit rabbit1=new Rabbit();
        Rabbit rabbit2=new Rabbit();
        Rabbit rabbit3=new Rabbit();

        rabbit1.setShape("네모");
        rabbit2.setShape("세모");
        rabbit3.setShape("동그라미");

        rabbit1.setPosition(50,60);
        rabbit2.setPosition(90,50);
        rabbit3.setPosition(70,60);

        System.out.println(rabbit1.toString());
        System.out.println(rabbit2);
        System.out.println(rabbit3.toString());

        rabbit1.move();
        rabbit2.move();
        rabbit3.move();
    }
}
