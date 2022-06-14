public class Main {
    public static void main(String[] args) {
        AbstractFactory victorianProduct = FactoryProducer.getBrand("victorian");
        victorianProduct.getSeaterType("sofa").sitOn();
        victorianProduct.getSeaterType("chair").sitOn();

        AbstractFactory modernProduct = FactoryProducer.getBrand("modern");
        modernProduct.getSeaterType("sofa").sitOn();
        modernProduct.getSeaterType("chair").sitOn();

    }
}
