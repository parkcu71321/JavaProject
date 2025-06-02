package Chapter07;

public class CarTest {
    public static void main(String []args){
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setName("genesis");
        car1.setPrice(100000000);
        car1.setProduct("hyendai");
        car1.setCc(2000);
        car1.setYear(2023);

        car2.setName("s class");
        car2.setPrice(200000000);
        car2.setProduct("mercedesbenz");
        car2.setCc(3000);
        car2.setYear(2024);

        car3.setName("GV70");
        car3.setPrice(130000000);
        car3.setProduct("hyendai");
        car3.setCc(2005);
        car3.setYear(2025);

        System.out.println(car1.toString());

        System.out.print(car1.getName()+"자동차가 ");
        car1.start();
        car1.drive(60);
        car1.forward();
        car1.stop();

        System.out.print("\n"+car3.getName()+"자동차가 ");
        car1.start();
        car1.drive(760);
        car1.forward();
        car1.stop();
    }
}
