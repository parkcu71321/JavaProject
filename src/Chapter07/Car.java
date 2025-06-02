package Chapter07;

public class Car {
    private String name;
    private String product;
    private int price;
    private int year;
    private int cc;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    /*메서드*/

    public void start(){
        System.out.println("시동을 건다.");
    }

    public void drive(int skr){
        speed=skr;
        System.out.println("시속"+speed+"로 달린다.");
    }

    public void forward(){
        System.out.println("전진");
    }

    public void backward(){
        System.out.println("후진");
    }

    public void stop(){
        System.out.println("정지");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }


}
