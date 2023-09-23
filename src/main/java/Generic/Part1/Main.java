package Generic.Part1;

interface Player{}
record BaseballPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
        BaseballTeam team1 = new BaseballTeam("Philadelphia Phillies");
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        team1.addTeamMember(harper);
        team1.addTeamMember(marsh);
        team1.listTeamMembers();

        BaseballTeam team2 = new BaseballTeam("Houston Astros");
        scoreResult(team1, 10, team2, 8);
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
