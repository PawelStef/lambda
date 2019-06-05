package zadanieFifa;

import zadanieJeden.OfertaSprzedaży;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FootbalTeam> teams = new ArrayList<FootbalTeam>(Arrays.asList(
                new FootbalTeam("Arsenal", 15, 55, 15, 5, 18 ),
                new FootbalTeam("Bayer", 14, 34, 8, 22, 8 ),
                new FootbalTeam("Szalke", 345, 666, 25, 5, 8 ),
                new FootbalTeam("Porto", 15, 55, 28, 1, 9 )
        ));

        Collections.sort(teams, new ComeratorFootbalTeam());
        System.out.println(teams);

    }
}
