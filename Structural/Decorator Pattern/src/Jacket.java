public class Jacket extends ClothingMixMatchDecorator{
    Jacket(Dress dress) {
        super(dress);
    }

    public void wearCloth(){
        dress.wearCloth();
        System.out.print(" + Jacket");
    }
}
