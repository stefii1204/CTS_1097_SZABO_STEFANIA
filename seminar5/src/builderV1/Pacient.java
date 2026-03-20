package builderV1;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalat;
    private String nume;

    public Pacient() {
        this.arePatRabatabil=false;
        this.areMicDejun=false;
        this.arePapuciCamera=false;
        this.areHalat=false;
        this.nume="anonim";
    }

    public Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
