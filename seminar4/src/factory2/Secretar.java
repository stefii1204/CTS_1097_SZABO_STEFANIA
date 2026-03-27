package factory2;

import factory.PersonalSpital;

public class Secretar implements PersonalSpital {

    @Override
    public void afiseaza() {
        System.out.println("Secretar");
    }
}
