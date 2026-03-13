import factory.FactoryPersonal;
import factory.PersonalSpital;
import factory.TipPersonalSpital;
import singleton.BazaDeDateEnum;

public class Main{

    public static void main(String[] args) {

        BazaDeDateEnum instanta=BazaDeDateEnum.instanta;
        System.out.println(instanta);

        BazaDeDateEnum instanta2=BazaDeDateEnum.instanta;
        System.out.println(instanta2);
        if(instanta==instanta2)
        {
            System.out.println(true);
        }
        PersonalSpital medic=FactoryPersonal.getPersonal(TipPersonalSpital.Medic);
        medic.afiseaza();

        PersonalSpital asistent=FactoryPersonal.getPersonal(TipPersonalSpital.Asistent);
        asistent.afiseaza();
    }
}
