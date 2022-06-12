public class FactoryProducer {

    public static AbstractFactory getBrand(String brandName){
        if(brandName.equalsIgnoreCase("victorian")){
            return new VictorianProductsFactory();
        }
        else if(brandName.equalsIgnoreCase("modern")){
            return new ModernProductsFactory();
        }
        return null;
    }
}
