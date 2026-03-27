package FactoryMethod;

import java.util.Arrays;
import java.util.List;

public class Main3 {
        static void main() {
            FeluriDeMancareFactory factorySupa = FactorySupa.getInstanta();
            FeluriDeMancareFactory factoryDes = FactoryDesert.getInstanta();
            try {
                FeluriMancare supa1 = factorySupa.getFeluriDeMancare(TipSupa.LEGUME, "Supa casei");
                FeluriMancare supa2 = factorySupa.getFeluriDeMancare(TipSupa.CIUPERCI, "Supa 2");
                FeluriMancare supa3 = factorySupa.getFeluriDeMancare(TipSupa.VITA, "Supa casei", 120.0);

                FeluriMancare d1 = factoryDes.getFeluriDeMancare(TipDesert.PAPANASI, "d1");
                FeluriMancare d2 = factoryDes.getFeluriDeMancare(TipDesert.CLATITE, "d2");
                FeluriMancare d3 = factoryDes.getFeluriDeMancare(TipDesert.CHEESECAKE, "d3", 120.0);

                List<FeluriMancare> feluriMancare = Arrays.asList(supa1, supa2, supa3, d1, d2, d3);
                feluriMancare.forEach(System.out::println);
            }
            catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
