package singleton;

public class BazaDeDateHelper {
    private String denumire;
    private int numarCampuri;
    private static class BazaDeDateInner{
        private static BazaDeDateHelper instanta= new BazaDeDateHelper();
    }

    private static BazaDeDateHelper instanta= null;

    public static synchronized BazaDeDateHelper getInstanta() {
        return BazaDeDateHelper.instanta;
    }


    private BazaDeDateHelper() {
        this.denumire = "BazaDeDate";
        this.numarCampuri = 4;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateHelper{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}

