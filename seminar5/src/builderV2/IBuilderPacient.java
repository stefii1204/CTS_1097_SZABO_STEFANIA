package builderV2;

import builderV2.Pacient;

public interface IBuilderPacient {
    Pacient buildPacient();

    IBuilderPacient setArePatRabatabil(Boolean arePatRabatabil);
    IBuilderPacient setAreMicDejun(Boolean areMicDejun);
    IBuilderPacient setArePapuciDeCamera(Boolean arePapuciDeCamera);
    IBuilderPacient setHalat(Boolean areHalat);
    IBuilderPacient setNume(String nume);


}