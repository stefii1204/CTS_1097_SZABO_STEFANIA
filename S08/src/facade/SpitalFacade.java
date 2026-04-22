package facade;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(int nrPacient){
        Pacient pacient = this.medic.getPacienti().get(nrPacient);
        if(!this.medic.decideInternare(nrPacient)){
            System.out.println("Pacientul nu are o stare grava, nu trebuie sa-l internam!!");
            return;
        }
        System.out.println("Pacientul are o stare grava. Verificare paturi ....");
        if(!this.salon.arePaturiLibere()){
            System.out.println("Nu exista paturi libere!");
            return;
        }
        int nrPat = this.salon.ocupaPrimulPatLiber();
        System.out.println("Pacientul " + nrPacient + "a fost internat internat");
    }
}
