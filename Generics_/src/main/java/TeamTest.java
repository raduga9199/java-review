public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bekham = new SoccerPlayer("Bekham");

        // Team liverpool = new Team("Liverpool");
        Team<SoccerPlayer> liverpool = new Team<>("liverpool");
        Team<FootballPlayer> NationalFootballTeam = new Team<>("National Football Team");
        Team<BaseballPlayer> NationalBaseballTeam = new Team<>("National Baseball Team");

        // Team<String> brokenTeam = new Team<>("This won't work");

        NationalFootballTeam.addPlayer(joe);
        NationalBaseballTeam.addPlayer(pat);
        liverpool.addPlayer(bekham);

        System.out.println(liverpool.numPlayers());
        System.out.println(NationalBaseballTeam.numPlayers());
        System.out.println(NationalFootballTeam.numPlayers());
    }
}
