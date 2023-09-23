package Generic.Part2;

interface Player {
    String name();
} //player

record BaseballPlayer(String name, String position) implements Player {}
record footballPlayer(String name, String position) implements Player {}
record volleyballPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
        var philly = new Affiliation("city", "Philadelphia", "PA");
    Team<BaseballPlayer, Affiliation> bt1= new Team<>("Philadelphia Phillies");
    Team<BaseballPlayer, String> bt2 = new Team<>("Houston Astros");
    scoreResult(bt1, 10, bt2, 8);

    Team<footballPlayer, Affiliation> ft1 = new Team<>("Adelaide Crows");
    Team<footballPlayer, Affiliation> ft2 = new Team<>("Adelaide Storm");

    var team = new Team<volleyballPlayer, Affiliation>("");
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
