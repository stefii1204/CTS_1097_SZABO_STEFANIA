package decorator;

public class RezultatDecorator implements IRezultate{
    private IRezultate iRezultate;

    public RezultatDecorator(IRezultate iRezultate) {
        this.iRezultate = iRezultate;
    }

    @Override
    public void afiseazaRezultate() {
        this.iRezultate.afiseazaRezultate();
    }
}
