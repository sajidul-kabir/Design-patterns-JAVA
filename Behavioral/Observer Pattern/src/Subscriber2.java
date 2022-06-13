public class Subscriber2 implements Observer{
    IphoneNewsPublisher publisher;
    Subscriber2(IphoneNewsPublisher publisher){
        this.publisher=publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Hello subcriber 2 your latest Iphone news is : "+this.publisher.getNews());
    }
}