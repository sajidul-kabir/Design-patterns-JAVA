public class Main {
    public static void main(String[] args) {
        Dress dress1 = new Jacket(new CasualAttire());
        dress1.wearCloth();
        System.out.println("");


        Dress dress2 = new Tie(new Uniform());
        dress2.wearCloth();
        System.out.println("");


        Dress dress3 = new Jacket(new Tie(new Uniform()));
        dress3.wearCloth();
        System.out.println("");

        Dress dress4 =  new Jacket(new Uniform());
        dress4.wearCloth();
    }
}
