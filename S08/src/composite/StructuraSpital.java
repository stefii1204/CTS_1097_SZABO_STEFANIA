package composite;

public abstract class StructuraSpital {
    private String nume;

    public abstract void afiseazaIerarhie(String identare);

    public StructuraSpital(String nume) {
        this.nume = nume;
    }

    public void adauga(StructuraSpital structuraSpital){
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public void sterge(StructuraSpital structuraSpital){
        throw  new UnsupportedOperationException("Not supported yet!");
    }

    public StructuraSpital getStucturaSpital(int index){
        throw new UnsupportedOperationException("Not supported yet!");
    }

    public String getNume(){
        return this.nume;
    }

}
