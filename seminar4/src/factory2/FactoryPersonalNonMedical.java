package factory2;

public class FactoryPersonalNonMedical extends FactoryPersonal {
    @Override
    public PersonalSpital getPersonalSpital(TipPersonalNonMedical tipPersonalNonMedical) {
        switch (tipPersonalNonMedical)
        {
            case TipPersonalNonMedical.Registrator ->
            {
                return new Registrator();
            }
            case TipPersonalNonMedical.Secretar ->
            {
                return new Secretar();
            }
            default -> {return null;}
        }

    }
}
