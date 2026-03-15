package singleton;

public class BazaDeDateStatic {

    private String denumire;
    private int numarCampuri;
    private static BazaDeDateStatic instanta;

    static{
        try{
           instanta = new BazaDeDateStatic("Baza1", 2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static BazaDeDateStatic getInstanta(){
        return instanta;
    }

    private BazaDeDateStatic(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateStatic{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}
