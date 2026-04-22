package factoryMethod;

public class Clatite extends FeluriMancare{
    public Clatite(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Clatite" + this.getDenumire());

    }
}
