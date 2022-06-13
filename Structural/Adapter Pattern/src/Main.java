public class Main {
    public static void main(String[] args) {
        OldConfiguration oldConfiguration = new OldConfiguration();
        oldConfiguration.xmlFormat();

        SmartConfiguration smartConfiguration = new SmartConfiguration();
        smartConfiguration.JsonFormat();

        Xml convertedFormat = new Adapter(smartConfiguration);
        convertedFormat.xmlFormat();
    }
}
