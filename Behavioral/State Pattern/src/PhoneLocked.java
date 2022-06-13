public class PhoneLocked  implements ButtonPress{
    @Override
    public void doAction(PhoneContext context) {
        System.out.println("The phone is locked so button press will lead to the unlock screen");
        context.setState(this);
    }
}