public abstract class ClothingMixMatchDecorator implements Dress{
    protected Dress dress;
    ClothingMixMatchDecorator(Dress dress){
        this.dress=dress;
    }
    public void wearCloth(){
        this.dress.wearCloth();
    }

}
