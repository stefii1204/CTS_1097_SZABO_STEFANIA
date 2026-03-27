package factory;

public class FactoryPersonal {
    public static PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital)
    {
       switch (tipPersonalSpital){
           case TipPersonalSpital.Asistent -> {
               return new Asistent();
           }
           case TipPersonalSpital.Medic -> {
               return new Medic();
           }
           case TipPersonalSpital.Brancardier -> {
               return new Brancardier();
           }
           default -> {return null;}
       }
    }
}
