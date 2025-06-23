package chapter08.section4;

public class PhoneTest
{
    public static void main(String[] args)
    {
        TelePhone telePhone = new TelePhone();
        FeaturePhone featurePhone=new FeaturePhone();
        SmartPhone smartPhone=new SmartPhone();

        featurePhone.callPhone("010-1234-5678");
        featurePhone.pickupPhone("010-2345-6789");

        featurePhone.sendSMS("010-2222-2222","인터페이스 배우는 중 아주 많이 사용됩니다.");

        smartPhone.installApp("카카오톡");
    }
}
