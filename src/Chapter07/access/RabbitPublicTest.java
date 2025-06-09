package Chapter07.access;

public class RabbitPublicTest {
    public static void main(String[] args){
        RabbitPublic rabbit = new RabbitPublic();
        rabbit.shape="cycle";
        rabbit.x=54;
        rabbit.y=87;

        System.out.println("위치: "+"("+rabbit.x+","+
                rabbit.y+")"+" 모양: "+rabbit.shape);
    }
}
