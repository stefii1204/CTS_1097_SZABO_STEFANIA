package FactoryMethod;

public class FactorySupa extends FeluriDeMancareFactory {

    private static FactorySupa instanta;

    private FactorySupa() {
    }

    public static FactorySupa getInstanta() {
        if (FactorySupa.instanta == null) {
            FactorySupa.instanta = new FactorySupa();
        }
        return FactorySupa.instanta;
    }


    @Override
    public FeluriMancare getFeluriDeMancare (TipFel tipFel, String denumire) throws Exception {
        return switch (tipFel) {
            case TipSupa.LEGUME -> new SupaDeLegume(denumire);
            case TipSupa.CIUPERCI -> new SupaDeCiuperci(denumire);
            default -> throw new Exception("Tip invalid!");
        };
    }

    public FeluriMancare getFeluriDeMancare (TipFel tipFel, String denumire, Double gramaj) throws Exception {
        return switch (tipFel) {
            case TipSupa.VITA -> new SupaDeVita(denumire, gramaj);
            default -> this.getFeluriDeMancare(tipFel, denumire);

        };
    }
}
