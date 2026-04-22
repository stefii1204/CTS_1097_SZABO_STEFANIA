package adaptorClase;

public class MedicamentAdaptor extends MedicamentSpital implements IMedicamentFarmacie {


    public MedicamentAdaptor(String nume) {
        super(nume);
    }


    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
        System.out.println("Achizitia noului medicament se face prin farmacie!");
    }
}
