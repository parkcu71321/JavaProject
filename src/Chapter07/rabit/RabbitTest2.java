package Chapter07.rabit;

public class RabbitTest2 {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        System.out.println(rabbit.toString());

        Rabbit rabbit1=new Rabbit("스컬토끼",67,98);
        System.out.println(rabbit1.toString());
    }
}
