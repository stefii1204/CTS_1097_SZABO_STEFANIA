package singleton;

public class BazaDeDateEager {
    //initializeaza instanta indiferent de situatie

    private String denumire;
    private int numarCampuri;

    private static final BazaDeDateEager instanta= new BazaDeDateEager("Baza1", 2);

    public static BazaDeDateEager getInstanta(){
        return instanta;
    }

    private BazaDeDateEager(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateEager{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}
