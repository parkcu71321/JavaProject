package chapter08.section4;

public class TelePhone implements Phone
{
    @Override
    public void callPhone(String phonenum) {
        System.out.println("TelePhone Calling "+phonenum);
    }

    @Override
    public void pickupPhone(String phonenum) {
        System.out.println("TelePhone pickup "+phonenum);
    }
}
