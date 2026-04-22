package composite;

public class Sectie extends StructuraSpital{

    public Sectie(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaIerarhie(String identare) {
        System.out.println(identare + super.getNume());
    }
}
