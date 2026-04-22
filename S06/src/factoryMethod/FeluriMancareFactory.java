package factoryMethod;

public abstract  class FeluriMancareFactory {

    public FeluriMancareFactory(){}

    public abstract FeluriMancare getFeluriDeMancare(TipFel fel, String denumire);

    public abstract FeluriMancare getFeluriDeMancare(TipFel fel, String denumire, Double gramaj);

}
