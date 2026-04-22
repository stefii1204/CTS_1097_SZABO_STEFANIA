package factoryMethod;

public class SupaCiuperci extends FeluriMancare{
    public SupaCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.getDenumire());
    }

}
