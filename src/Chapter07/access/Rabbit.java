package Chapter07.access;

public class Rabbit {
    private String shape;
    private int x;
    private int y;

    void setPosition(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String getShape(){
        return shape;
    }

    public void setShape(String shape){
        this.shape=shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
