package Builder;

public class BuilderRezervare {

    private static BuilderRezervare instanta;

    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMuzicaAmbientala;
    private boolean areMasaDecorata;
    private String genMuzica;


    private BuilderRezervare() {
        this.resetare();
    }


    public Rezervare build() {
        return new Rezervare(this.areAsezareLaGeam, this.areScauneErgonomice,
                this.areMuzicaAmbientala, this.areMasaDecorata, this.genMuzica);
    }

    public BuilderRezervare setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        return this;
    }

    public BuilderRezervare setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public BuilderRezervare setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }


    public static BuilderRezervare getInstance() {
        if (instanta == null) {
            instanta = new BuilderRezervare();
        }
        return instanta;
    }


    public BuilderRezervare resetare() {
        this.areAsezareLaGeam = false;
        this.areScauneErgonomice = false;
        this.areMuzicaAmbientala = false;
        this.areMasaDecorata = false;
        this.genMuzica = "anonim";
        return this;
    }
}