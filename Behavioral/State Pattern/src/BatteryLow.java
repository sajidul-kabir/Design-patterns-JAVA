public class BatteryLow  implements ButtonPress{
    @Override
    public void doAction(PhoneContext context) {
        System.out.println("The Battery is low so button press will lead to charge your phone screen");
        context.setState(this);
    }
}