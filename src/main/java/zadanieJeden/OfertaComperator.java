package zadanieJeden;

import java.util.Comparator;

public class OfertaComperator implements Comparator<OfertaSprzedaży> {
    public OfertaComperator(boolean rosnaco) {
        this.rosnaco = rosnaco;
    }

    boolean rosnaco;
    public int compare(OfertaSprzedaży o1, OfertaSprzedaży o2) {
        if (rosnaco){
            return Double.compare(o1.getCena(),o2.getCena());
        }else {
            return Double.compare(o2.getCena(),o1.getCena());
        }

    }
}
