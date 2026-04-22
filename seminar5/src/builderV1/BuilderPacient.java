package builderV1;

public class BuilderPacient implements IBuilderPacient {
    private Pacient pacient;

    public BuilderPacient() {
        this.pacient=new Pacient();
    }

    @Override
    public Pacient buildPacient() {
        return null;
    }

    @Override
    public IBuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    @Override
    public IBuilderPacient setArePapuciCamera(boolean arePapuciCamera) {
        this.pacient.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    @Override
    public IBuilderPacient setAreHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.pacient.setNume(nume);
        return this;
    }
}
