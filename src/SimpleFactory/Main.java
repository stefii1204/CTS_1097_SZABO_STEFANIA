package SimpleFactory;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        FactorySupa factorySupa = FactorySupa.getInstance();
        try {
            Supa supa1 = factorySupa.getSupa(TipSupa.LEGUME, "Supa casei");
            Supa supa2 = factorySupa.getSupa(TipSupa.CIUPERCI, "Supa 2");
            Supa supa3 = factorySupa.getSupa(TipSupa.VITA, "Supa casei", 120.0);

            List<Supa> supe = Arrays.asList(supa1, supa2, supa3);
            supe.forEach(System.out::println);
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
