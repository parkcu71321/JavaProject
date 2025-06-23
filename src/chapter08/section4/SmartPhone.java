package chapter08.section4;

public class SmartPhone implements Phone
{
    @Override
    public void callPhone(String phonenum) {
        System.out.println("SmartPhone Calling "+phonenum);
    }

    @Override
    public void pickupPhone(String phonenum) {
        System.out.println("SmartPhone pickup "+phonenum);
    }

    public void sendSMS(String phonenum, String message)
    {
        System.out.println("Sending SMS to "+ phonenum);
        System.out.println(message);
    }

    public void receiveSMS(String phonenum, String message)
    {
        System.out.println("Receive SMS from "+ phonenum);
        System.out.println(message);
    }

    public void installApp(String app)
    {
        System.out.println("Install "+app);
    }
}
