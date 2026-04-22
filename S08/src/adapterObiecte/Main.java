package adapterObiecte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nume");

        IMedicamentFarmacie adaptor = new MedicamentFarmacie();
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();

        adaptor.cumparaMedicament();

        List<IMedicamentFarmacie> lista= new ArrayList<>();
        lista.add(medicamentFarmacie);

        lista.forEach(IMedicamentFarmacie::cumparaMedicament);

    }
}
