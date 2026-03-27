package FactoryMethod;

public class SupaDeCiuperci extends FeluriMancare{

    public SupaDeCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa de ciuperci" + super.getDenumire());
    }
}
