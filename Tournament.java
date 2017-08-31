
public class Tournament {

	
	public static void main(String[] args) {
		
		SoccerTeam team1 = new SoccerTeam();
		 SoccerTeam team2 = new SoccerTeam();
		 SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		team1.played(team2, 4, 2 );
		team3.played(team4, 1, 3);
		team4.setOpponentWins(1);
		team1.played(team4, 2, 2);
		team4.setOpponentTies(1);
		team2.played(team3, 1, 0);
		
		team1.tournamentPoints();
		team2.tournamentPoints();
		team3.tournamentPoints();
		team4.tournamentPoints();
		
		
		
		System.out.println("Team 1 got " + team1.getPoints() + " points.");
		System.out.println("Team 2 got " + team2.getPoints() + " points.");
		System.out.println("Team 3 got " + team3.getPoints() + " points.");
		System.out.println("Team 4 got " + team4.getPoints() + " points.");
		System.out.println("");
		System.out.println("There was " + SoccerTeam.gamesplayed() + " games played.");
		System.out.println("There was " + SoccerTeam.goalsmade() + " goals made.");
		
	}
}
