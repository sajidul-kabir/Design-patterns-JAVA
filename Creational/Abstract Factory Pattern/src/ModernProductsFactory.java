public class ModernProductsFactory extends AbstractFactory{

    @Override
    seater getSeaterType(String seaterType) {
        if(seaterType.equalsIgnoreCase("chair")){
            return new ModernChair();
        }
        else if(seaterType.equalsIgnoreCase("sofa")){
            return new ModernSofa();
        }
        return null;
    }
}
