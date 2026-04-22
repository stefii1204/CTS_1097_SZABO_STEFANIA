package builderV3;
import builderV3.Pacient;
import builderV1.BuilderPacient;
import builderV1.IBuilderPacient;

public class Main3 {
    public static void main(String[] args) {
        Pacient pacient = new Pacient.Builder()
                .setNume("Andrei")
                .setAreMicDejun(true)
                .setArePapuciDeCamera(true)
                .build();

        System.out.println(pacient);


    }
}