package builderV2;

public class Pacient {
    private final boolean arePatRabatabil;
    private final boolean areMicDejun;
    private final boolean arePapuciDeCamera;
    private final boolean areHalat;
    private final String nume;

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}