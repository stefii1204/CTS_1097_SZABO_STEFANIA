package builderV2;

public class BuilderPacient implements IBuilderPacient{
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String nume;

    private Pacient pacient;

    public BuilderPacient() {
        this.arePatRabatabil=false;
        this.areMicDejun=false;
        this.arePapuciDeCamera=false;
        this.areHalat=false;
        this.nume="Anonim";

    }

    @Override
    public Pacient buildPacient() {
        return new Pacient(this.arePatRabatabil, this.areMicDejun, this.arePapuciDeCamera, this.areHalat, this.nume);
    }

    @Override
    public IBuilderPacient setArePatRabatabil(Boolean arePatRabatabil) {
        this.arePatRabatabil=arePatRabatabil;
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(Boolean areMicDejun) {
        this.areMicDejun=areMicDejun;
        return this;
    }

    @Override
    public IBuilderPacient setArePapuciDeCamera(Boolean arePapuciDeCamera) {
        this.arePapuciDeCamera=arePapuciDeCamera;
        return  this;
    }

    @Override
    public IBuilderPacient setHalat(Boolean areHalat) {
        this.areHalat=areHalat;
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.nume=nume;
        return  this;
    }



}