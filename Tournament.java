
public class Tournament {

	
	public static void main(String[] args) {
		
		SoccerTeam team1 = new SoccerTeam();
		 SoccerTeam team2 = new SoccerTeam();
		 SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		team1.played(team2, 4, 2 );
		team3.played(team4, 1, 3);
		team1.played(team4, 2, 2);
		team2.played(team3, 1, 0);
		
		
		
		
		System.out.println("There was " + SoccerTeam.gamesplayed() + " games played.");
		
	}
}
