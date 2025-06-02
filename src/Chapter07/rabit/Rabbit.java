package Chapter07.rabit;

public class Rabbit {

    String shape;
    int x;
    int y;

    public void setPosition(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void move(){
        System.out.println("토끼가 ("+x+","+y+")좌표로 이동한다");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
