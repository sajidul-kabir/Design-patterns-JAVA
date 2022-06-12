public class VictorianProductsFactory extends AbstractFactory{

    @Override
    seater getSeaterType(String seaterType) {
        if(seaterType.equalsIgnoreCase("chair")){
            return new VictorianChair();
        }
        else if(seaterType.equalsIgnoreCase("sofa")){
            return new VictorianSofa();
        }
        return null;
    }
}
