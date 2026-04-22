package builder;

public class MainBuilder {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new BuilderRezervare();
        Rezervare rezervare = builderRezervare.build();

        System.out.println(rezervare);




    }
}
