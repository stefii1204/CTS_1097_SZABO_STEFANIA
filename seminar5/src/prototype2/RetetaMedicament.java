package prototype2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetetaMedicament implements RetetaCloneable {
    private String nume;
    private List <Solutii> solutii;

    public RetetaMedicament(String nume, List<Solutii> solutii) {
        this.nume = nume;
        this.solutii=new ArrayList<>(solutii);
    }

    public RetetaMedicament(RetetaMedicament altaReteta){
        this.nume=altaReteta.nume;
        List<Solutii> copieSolutie = new ArrayList<>();
        for(Solutii solutie : altaReteta.solutii)
        {
            copieSolutie.add((Solutii) solutie.clone());
        }
        this.solutii=new ArrayList<>(copieSolutie);
    }

    public List<Solutii> getSolutii() {
        return solutii;
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    @Override
    public RetetaCloneable cloneaza() {
        return new RetetaMedicament(this);
    }
}
