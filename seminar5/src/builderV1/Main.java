package builderV1;

import builderV1.BuilderPacient;
import builderV1.IBuilderPacient;
import builderV1.Pacient;

public class Main {
    static void main(String[] args) {
        IBuilderPacient builderPacient=new BuilderPacient();
        Pacient pacient=builderPacient.setNume("Matei").setAreHalat(true).setAreMicDejun(true).buildPacient();
        System.out.println(pacient);
        Pacient pacient1=builderPacient.setNume("Ionut").setAreHalat(true).setAreMicDejun(true).buildPacient();
        System.out.println(pacient1);
    }
}
