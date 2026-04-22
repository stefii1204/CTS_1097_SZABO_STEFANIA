package factoryMethod;

public abstract class FeluriMancare {
    private String denumire;

    public FeluriMancare(String denumire) {
        this.denumire=denumire;
    }

    @Override
    public String toString() {
        return "FeluriMancare{" +
                "denumire='" + denumire + '\'' +
                '}';
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afiseazaDetalii();
}
