package adaptorClase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nume");

        IMedicamentFarmacie adaptor = new MedicamentAdaptor("Medicament spital");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();



        List<IMedicamentFarmacie> lista= new ArrayList<>();

        lista.add(medicamentFarmacie);
        lista.add(adaptor);

        lista.forEach(IMedicamentFarmacie::cumparaMedicament);

    }
}
