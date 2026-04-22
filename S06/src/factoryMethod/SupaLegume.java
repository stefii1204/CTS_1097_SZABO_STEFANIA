package factoryMethod;

public class SupaLegume extends FeluriMancare{
    public SupaLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.getDenumire());
    }
}
