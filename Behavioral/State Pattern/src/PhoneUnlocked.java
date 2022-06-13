public class PhoneUnlocked implements ButtonPress{
    @Override
    public void doAction(PhoneContext context) {
        System.out.println("The phone is unlocked so button press will execute fuctions");
        context.setState(this);
    }
}
