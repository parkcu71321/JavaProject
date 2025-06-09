package Chapter07.access;

public class RabbitTest {
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();

        rabbit.setShape("cycle");
        rabbit.setPosition(5,8);

        System.out.println("위치: "+"("+rabbit.getX()+","+
                rabbit.getY()+")"+" 모양: "+rabbit.getShape());
    }
}
