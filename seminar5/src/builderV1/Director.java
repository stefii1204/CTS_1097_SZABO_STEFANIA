package builderV1;

public class Director {
    public Pacient buildPacientStandard()
    {
        return new BuilderPacient().setAreHalat(true).buildPacient();
    }
}
