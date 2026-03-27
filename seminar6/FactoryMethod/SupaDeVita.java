package FactoryMethod;

public class SupaDeVita extends FeluriMancare{
    private Double gramaj;

    public SupaDeVita(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa de vita" + super.getDenumire() + " " + this.gramaj);
    }

    @Override
    public String toString() {
        return super.toString() + "SupaVita{" +
                "gramaj=" + gramaj +
                '}';
    }
}
