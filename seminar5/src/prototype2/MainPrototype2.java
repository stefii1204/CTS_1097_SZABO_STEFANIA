import prototype2.RetetaMedicament;
import prototype2.Solutii;

void main(){
    RetetaMedicament retetaMedicament=new RetetaMedicament("medicament1", List.of(new Solutii("solutie1", 10.1), new Solutii( "solutie2", 10.2)));
    RetetaMedicament copieRetetaMedicament= (RetetaMedicament) retetaMedicament.cloneaza();
    System.out.println(retetaMedicament==copieRetetaMedicament);
    System.out.println(retetaMedicament);
    System.out.println(copieRetetaMedicament);

    retetaMedicament.getSolutii().getFirst().setCantitate(34.56);
    System.out.println(retetaMedicament);
    System.out.println(copieRetetaMedicament);

}
