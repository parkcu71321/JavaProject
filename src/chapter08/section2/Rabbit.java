package chapter08.section2;

public class Rabbit
{
    String shape;
    int x,y;

    Rabbit()
    {
        super();            //부모 클래스의 기본 생성자 호출
        System.out.println("Rabbit 생성자");
    }

    void move(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.printf("(%d,%d)로 이동\n",x,y);
    }
}
