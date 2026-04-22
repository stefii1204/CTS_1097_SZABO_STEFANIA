package builder;

public class BuilderRezervare extends Builder {

    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMuzicaAmbientala;
    private boolean areMasaDecorata;
    private String genMuzica;

    public BuilderRezervare() {
        resetare();
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

    @Override
    public Rezervare build() {
        return new Rezervare(
                areAsezareLaGeam,
                areScauneErgonomice,
                areMuzicaAmbientala,
                areMasaDecorata,
                genMuzica
        );
    }

    public BuilderRezervare resetare() {
        this.areAsezareLaGeam = false;
        this.areScauneErgonomice = false;
        this.areMuzicaAmbientala = false;
        this.areMasaDecorata = false;
        this.genMuzica = "necunoscut";
        return this;
    }
}