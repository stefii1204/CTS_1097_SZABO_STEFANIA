package simpleFactory;

public class MainFactory {
    public static void main(String[] args) throws Exception {
        FactorySupa factorySupa = FactorySupa.getInstance();

        Supa supa1 = factorySupa.getSupa(TipSupa.LEGUME, "Supa casei 1");
        Supa supa2 = factorySupa.getSupa(TipSupa.CIUPERCI, "Supa casei 2");

        System.out.println(supa1);
        System.out.println(supa2);


    }


}
