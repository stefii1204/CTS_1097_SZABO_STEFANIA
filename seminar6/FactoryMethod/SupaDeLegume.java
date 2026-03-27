package FactoryMethod;

public class SupaDeLegume extends FeluriMancare{

    public SupaDeLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa de legume" + super.getDenumire());
    }
}
