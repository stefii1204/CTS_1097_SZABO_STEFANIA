package builderV2;

import builderV1.BuilderPacient;
import builderV1.IBuilderPacient;
import builderV1.Pacient;

public class Main2 {
    public static void main(String[] args) {
        IBuilderPacient builderPacient = new BuilderPacient();
        Pacient pacient = builderPacient.setNume("Andrei").setAreMicDejun(true).buildPacient();

        System.out.println(pacient);


    }
}