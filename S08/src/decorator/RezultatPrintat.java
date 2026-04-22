package decorator;

public class RezultatPrintat implements IRezultate{
    @Override
    public void afiseazaRezultate() {
        System.out.println("Medicamnetele au fost printate!!");
    }
}
