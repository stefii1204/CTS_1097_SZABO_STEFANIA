package proxy;

public class SpitalProxy implements ISpital {
    private ISpital spital;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void internare(Pacient pacient) {
        if(pacient.isAreAsigurareDeSanatate()){
            spital.internare(pacient);
        } else {
            System.out.println("Pacientul nu a fost internat!");
        }
    }
}
