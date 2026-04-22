import prototype.RetetaMedicament;

void main(){
    RetetaMedicament retetaMedicament=new RetetaMedicament("medicament1", Map.of("solutie1", 10.1, "solutie2", 10.2));
    RetetaMedicament copieRetetaMedicament= (RetetaMedicament) retetaMedicament.cloneaza();
    System.out.println(retetaMedicament==copieRetetaMedicament);
    System.out.println(retetaMedicament);
    System.out.println(copieRetetaMedicament);

    retetaMedicament.getSolutii().put("solutie1", 23.1);
    System.out.println(retetaMedicament);
    System.out.println(copieRetetaMedicament);

}
