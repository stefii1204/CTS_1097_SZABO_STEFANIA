package decorator;

public class Main {
    public static void main(String[] args) {
        IRezultate rezultate = new RezultatPrintat();
        IRezultate rezultateOnline = new RezultatOnlineDecorator(rezultate);

        rezultate.afiseazaRezultate();
        rezultateOnline.afiseazaRezultate();
        rezultate.afiseazaRezultate();
    }
}
