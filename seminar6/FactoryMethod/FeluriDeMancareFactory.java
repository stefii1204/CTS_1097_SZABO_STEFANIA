package FactoryMethod;

public abstract class FeluriDeMancareFactory {

    public abstract FeluriMancare getFeluriDeMancare(TipFel tipFel, String denumire) throws Exception;

    public abstract FeluriMancare getFeluriDeMancare(TipFel tipFel, String denumire, Double gramaj) throws Exception;

}
