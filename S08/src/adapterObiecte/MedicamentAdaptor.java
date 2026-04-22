package adapterObiecte;

public class MedicamentAdaptor implements IMedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdaptor(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }


    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
        System.out.println("Achizitia noului medicament se face prin farmacie!");
    }
}
