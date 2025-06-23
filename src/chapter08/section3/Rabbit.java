package chapter08.section3;

public abstract class Rabbit {
    String shape;
    int x,y;

    abstract void move(int x, int y);           //추상 메서드

    void eat(String food)
    {
        System.out.println("Rabbit "+shape+" eats "+food);
    }
}
