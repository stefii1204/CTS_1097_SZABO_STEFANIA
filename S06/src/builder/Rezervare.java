package builder;

public class Rezervare {
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMuzicaAmbientala;
    private boolean areMasaDecorata;
    private String genMuzica;

    protected Rezervare(boolean areAsezareLaGeam, boolean areScauneErgonomice, boolean areMuzicaAmbientala, boolean areMasaDecorata, String genMuzica) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areMasaDecorata = areMasaDecorata;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areAsezareLaGeam=" + areAsezareLaGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", areMasaDecorata=" + areMasaDecorata +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
