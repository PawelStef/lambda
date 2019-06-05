package zadanieFifa;

import java.util.Comparator;

public class ComeratorFootbalTeam implements Comparator<FootbalTeam> {


    public int compare(FootbalTeam o1, FootbalTeam o2) {


        return o1.getPoints() < o2.getPoints() ? 1 : (o1.getPoints() > o2.getPoints()) ? -1 :
                (o1.getScoreGoals() < o2.getScoreGoals() ? 1 : (o1.getScoreGoals() > o2.getScoreGoals()) ? -1 :
                        (o2.getLostGoals() < o1.getLostGoals() ? 1 : (o2.getLostGoals() > o2.getLostGoals()) ? -1 :
                                (o1.getTeamName().length()<o2.getTeamName().length() ? 1: -1)));
    }
}
