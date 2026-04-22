package simpleFactory;

public class SupaVita extends Supa{
    private Double gramaj;


    public SupaVita(String denumire, Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa legume" + super.getDenumire() + this.gramaj);
    }
}
