public class main {
    public static void main(String[] args) {
       factory factory=new factory();

       transport transport1 = factory.getTransport("truck");
       transport1.deliver();

       transport transport2 = factory.getTransport("ship");
       transport2.deliver();
    }

}
