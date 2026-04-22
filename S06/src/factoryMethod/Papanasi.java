package factoryMethod;

public class Papanasi extends FeluriMancare{
    public Papanasi(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.getDenumire());
    }
}
