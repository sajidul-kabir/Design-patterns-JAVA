public class Main {
    public static void main(String[] args) {
        IphoneNewsPublisher publisher=new IphoneNewsPublisher();

        Subscriber1 subscriber1= new Subscriber1(publisher);
        Subscriber2 subscriber2= new Subscriber2(publisher);

        publisher.getSubcribers();
        publisher.setNews("IPHONE 13 is out !!!");

        publisher.unSubscribe(subscriber2);
        publisher.setNews("Download BLUE WHALE now !!!");
        publisher.getSubcribers();

    }
}
