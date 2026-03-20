package prototype2;

public class Solutii implements Cloneable {
    private String nume;
    private Double cantitate;

    public Solutii(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Solutii{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
