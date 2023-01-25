package W_01;

public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bekham = new SoccerPlayer("Bekham");

        // Day_01.Team liverpool = new Day_01.Team("Liverpool");
        Team<SoccerPlayer> liverpool = new Team<>("liverpool");
        Team<FootballPlayer> NationalFootballTeam = new Team<>("National Football Day_01.Team");
        Team<BaseballPlayer> NationalBaseballTeam = new Team<>("National Baseball Day_01.Team");

        // Day_01.Team<String> brokenTeam = new Day_01.Team<>("This won't work");

        NationalFootballTeam.addPlayer(joe);
        NationalBaseballTeam.addPlayer(pat);
        liverpool.addPlayer(bekham);

        System.out.println(liverpool.numPlayers());
        System.out.println(NationalBaseballTeam.numPlayers());
        System.out.println(NationalFootballTeam.numPlayers());
    }
}
