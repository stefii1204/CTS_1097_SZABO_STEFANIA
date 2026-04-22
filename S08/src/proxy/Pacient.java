package proxy;

public class Pacient {
    private String nume;
    private boolean areAsigurareDeSanatate;

    public Pacient(String nume, boolean areAsigurareDeSanatate) {
        this.nume = nume;
        this.areAsigurareDeSanatate = areAsigurareDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurareDeSanatate() {
        return areAsigurareDeSanatate;
    }
}
