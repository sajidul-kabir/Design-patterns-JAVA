public class Main {
    public static void main(String[] args) {
        PhoneContext context=new PhoneContext();

        PhoneUnlocked phoneUnlocked =new PhoneUnlocked();
        phoneUnlocked.doAction(context);

        PhoneLocked phoneLocked=new PhoneLocked();
        phoneLocked.doAction(context);

        BatteryLow batteryLow=new BatteryLow();
        batteryLow.doAction(context);
    }
}
