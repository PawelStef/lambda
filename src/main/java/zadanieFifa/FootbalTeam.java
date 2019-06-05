package zadanieFifa;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class FootbalTeam {
    private String teamName;
    private int lostGoals;
    private int scoreGoals;
    private int wonMatches;
    private int lostMatches;
    private int drowMatches;

    private int points;

    public FootbalTeam(String teamName, int lostGoals, int scoreGoals, int wonMatches, int lostMatches, int drowMatches) {
        this.teamName = teamName;
        this.lostGoals = lostGoals;
        this.scoreGoals = scoreGoals;
        this.wonMatches = wonMatches;
        this.lostMatches = lostMatches;
        this.drowMatches = drowMatches;
        this.points = wonMatches*3+drowMatches;
    }
}
