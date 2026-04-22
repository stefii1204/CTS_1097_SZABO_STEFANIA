package builderV3;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String nume;

    private Pacient(Builder builder) {
        this.arePatRabatabil = builder.arePatRabatabil;
        this.areMicDejun = builder.areMicDejun;
        this.arePapuciDeCamera = builder.arePapuciDeCamera;
        this.areHalat = builder.areHalat;
        this.nume = builder.nume;
    }

    public static class Builder {
        private boolean arePatRabatabil = false;
        private boolean areMicDejun = false;
        private boolean arePapuciDeCamera = false;
        private boolean areHalat = false;
        private String nume = "Anonim";

        public Builder setArePatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return this;
        }

        public Builder setAreMicDejun(boolean areMicDejun) {
            this.areMicDejun = areMicDejun;
            return this;
        }

        public Builder setArePapuciDeCamera(boolean arePapuciDeCamera) {
            this.arePapuciDeCamera = arePapuciDeCamera;
            return this;
        }

        public Builder setAreHalat(boolean areHalat) {
            this.areHalat = areHalat;
            return this;
        }

        public Builder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public Pacient build() {
            return new Pacient(this);
        }
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