import Builder.BuilderRezervare;
import Builder.Rezervare;

void main() {
        BuilderRezervare builder = BuilderRezervare.getInstance();
        Rezervare rez = builder.resetare().build();
        Rezervare rez2 = builder.resetare().setAreAsezareLaGeam(true).setGenMuzica("clasice").builder();
        System.out.println(rez);
        System.out.println(rez2);
}
