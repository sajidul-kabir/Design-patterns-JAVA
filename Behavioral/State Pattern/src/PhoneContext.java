public class PhoneContext {
    private ButtonPress state;
    PhoneContext(){
        this.state=null;
    }
    public void setState(ButtonPress state){
        this.state = state;
    }

    public ButtonPress getState(){
        return state;
    }
}
