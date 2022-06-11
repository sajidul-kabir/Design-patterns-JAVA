public class Tie extends ClothingMixMatchDecorator{
    Tie(Dress dress) {
        super(dress);
    }
    public void wearCloth(){
        dress.wearCloth();
        System.out.print(" + Tie");
    }
}
