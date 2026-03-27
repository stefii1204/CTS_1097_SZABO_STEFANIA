package FactoryMethod;

public class Cheesecake extends FeluriMancare{
    private Double gramaj;
    public Cheesecake(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Cheesecake" + super.getDenumire() + " " + this.gramaj);
    }

    @Override
    public String toString() {
        return super.toString() + "Cheesecake{" +
                "gramaj=" + gramaj +
                '}';
    }
}
