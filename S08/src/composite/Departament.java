package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraSpital{
    private List<StructuraSpital> lista;

    public Departament(String nume) {
        super(nume);
        this.lista = new ArrayList<>();
    }

    @Override
    public void adauga(StructuraSpital structuraSpital) {
        this.lista.add(structuraSpital);
    }

    public Departament(String nume, List<StructuraSpital> lista) {
        super(nume);
        this.lista = lista;
    }

    @Override
    public void sterge(StructuraSpital structuraSpital) {
        this.lista.remove(structuraSpital);
    }

    @Override
    public StructuraSpital getStucturaSpital(int index) {
        return this.lista.get(index);
    }

    @Override
    public void afiseazaIerarhie(String identare) {
        System.out.println(identare + super.getNume());
        for(StructuraSpital structuraSpital:lista){
            structuraSpital.afiseazaIerarhie(identare + " ");
        }

    }
}
