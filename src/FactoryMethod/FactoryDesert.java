package FactoryMethod;

public class FactoryDesert extends FeluriDeMancareFactory {

    private static FactoryDesert instanta;

    private FactoryDesert() {
    }

    public static FactoryDesert getInstanta() {
        if(FactoryDesert.instanta == null) {
            FactoryDesert.instanta = new FactoryDesert();
        }
        return FactoryDesert.instanta;
    }

    @Override
    public FeluriMancare getFeluriDeMancare (TipFel tipFel, String denumire) throws Exception {
        return switch (tipFel) {
            case TipDesert.CLATITE -> new Clatite(denumire);
            case TipDesert.PAPANASI -> new Papanasi(denumire);
            default -> throw new Exception("Tip invalid!");
        };
    }

    public FeluriMancare getFeluriDeMancare (TipFel tipFel, String denumire, Double gramaj) throws Exception {
        return switch (tipFel) {
            case TipDesert.CHEESECAKE -> new Cheesecake(denumire, gramaj);
            default -> this.getFeluriDeMancare(tipFel, denumire);

        };
    }
}
