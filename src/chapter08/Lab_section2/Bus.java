package chapter08.Lab_section2;

public class Bus extends Car
{
    public void SpeedUp(int speed)
    {
        super.SpeedUp(speed);
        if(getSpeed()>60)
        {
            setSpeed(60);
        }
    }
}
