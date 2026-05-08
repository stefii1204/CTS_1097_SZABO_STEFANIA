package Command;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void internarePacient() {
        System.out.println("Pacientul" + " " + nume + " " + "a fost internat");
    }
    public void tratareImediat() {
        System.out.println("internare imediata");
    }
    public void anuleazaInternarePacient() {
        System.out.println("anuleaza internare pacient");
    }
    public void anuleazaTratareImediata() {
        System.out.println("anuleaza tratarea imediata");
    }
    public void refacereInternarePacient() {
        System.out.println("refacere internare pacient");
    }
    public void refacereTratareImediata(){
        System.out.println("refacere tratare");
    }
}
