public class Subscriber1 implements Observer{
    IphoneNewsPublisher publisher;
    Subscriber1(IphoneNewsPublisher publisher){
        this.publisher=publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Hello subcriber 1 your latest Iphone news is : "+this.publisher.getNews());
    }
}
