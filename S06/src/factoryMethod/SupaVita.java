package factoryMethod;

public class SupaVita extends FeluriMancare{
    private Double gramaj;

    public SupaVita(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj=gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.getDenumire() + this.gramaj);
    }

    @Override
    public String toString() {
        return "SupaVita{" +
                "gramaj=" + gramaj +
                '}';
    }
}
