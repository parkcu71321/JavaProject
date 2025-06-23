package chapter08.Lab_section2;

public class Car
{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void SpeedUp(int speed)
    {
        this.speed += speed;
    }
}
