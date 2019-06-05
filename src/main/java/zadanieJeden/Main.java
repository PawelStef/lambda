package zadanieJeden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedaży> oferta = new ArrayList<OfertaSprzedaży>(Arrays.asList(
                new OfertaSprzedaży("masło", 2.5),
                new OfertaSprzedaży("olej", 5.5),
                new OfertaSprzedaży("kakao", 10.1),
                new OfertaSprzedaży("woda", 1.8)
        ));


        //instancja anonimowa

        Collections.sort(oferta, new OfertaComperator(true));
        System.out.println(oferta);
        Collections.sort(oferta, new OfertaComperator(false));
        System.out.println(oferta);
    }


}
