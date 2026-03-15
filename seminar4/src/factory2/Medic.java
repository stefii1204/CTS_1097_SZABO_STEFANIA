package factory2;

import factory.PersonalSpital;

public class Medic implements PersonalSpital {
    @Override
    public void afiseaza() {
        System.out.println("Medic");
    }
}
