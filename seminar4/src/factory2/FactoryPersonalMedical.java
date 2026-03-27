package factory2;

public class FactoryPersonalMedical extends FactoryPersonal{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital) {
        switch (tipPersonalSpital)
        {
            case TipPersonalMedical.Medic ->
            {
                return new Medic();
            }
            case TipPersonalMedical.Asistent ->
            {
                return new Asistent();
            }
            case TipPersonalMedical.Brancardier ->
            {
                return new Brancardier();
            }
        }
    }
}
