package proxy;

public class Main {
    public static void main(String[] args) {
        ISpital iSpital1 = new Spital();
        ISpital spital2 = new SpitalProxy(iSpital1);

        Pacient pacient1 = new Pacient("Nume1", false);
        Pacient pacient2 = new Pacient("Nume2", true);

        iSpital1.internare(pacient1);
        iSpital1.internare(pacient2);

        spital2.internare(pacient1);
        spital2.internare(pacient2);

    }
}
