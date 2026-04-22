package factoryMethod;

public class Cheessecake extends FeluriMancare{
    public Cheessecake(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.getDenumire());
    }
}
