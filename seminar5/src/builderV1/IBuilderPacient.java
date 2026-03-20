package builderV1;

//builder are scopul sa creeze obiecte

public interface IBuilderPacient {
    Pacient buildPacient(); //va avea rolul sa creeze pacientul la final
    IBuilderPacient setArePatRabatabil(boolean arePatRabatabil);
    IBuilderPacient setAreMicDejun(boolean areMicDejun);
    IBuilderPacient setArePapuciCamera(boolean arePapuciCamera);
    IBuilderPacient setAreHalat(boolean areHalat);
    IBuilderPacient setNume(String nume);
}
