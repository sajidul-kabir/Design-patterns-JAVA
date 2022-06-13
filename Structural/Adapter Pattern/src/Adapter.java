public class Adapter implements Xml{

    private SmartConfiguration smartConfiguration;

    Adapter(SmartConfiguration smartConfiguration){
        this.smartConfiguration=smartConfiguration;
    }
    @Override
    public void xmlFormat() {
        this.smartConfiguration.JsonFormat();
    }
}
