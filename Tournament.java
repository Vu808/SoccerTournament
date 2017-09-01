
public class Tournament {

	
	public static void main(String[] args) {
		
		SoccerTeam team1 = new SoccerTeam();
		 SoccerTeam team2 = new SoccerTeam();
		 SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		team1.played(team2, 4, 2 );
		int goalsScored1 = SoccerTeam.goalsmade();
		team3.played(team4, 1, 3);
		int goalsScored2 = SoccerTeam.goalsmade();
		team4.setOpponentWins(1);
		team1.played(team4, 2, 2);
		int goalsScored3 = SoccerTeam.goalsmade();
		team4.setOpponentTies(1);
		team2.played(team3, 1, 0);
		int goalsScored4 = SoccerTeam.goalsmade();
		
		team1.tournamentPoints();
		team2.tournamentPoints();
		team3.tournamentPoints();
		team4.tournamentPoints();
		
		int totalGoalsMade = (goalsScored1 + goalsScored2 + goalsScored3 + goalsScored4);
		
		System.out.println("Tournament 1");
		System.out.println("");
		System.out.println("Team 1 got " + team1.getPoints() + " points.");
		System.out.println("Team 2 got " + team2.getPoints() + " points.");
		System.out.println("Team 3 got " + team3.getPoints() + " points.");
		System.out.println("Team 4 got " + team4.getPoints() + " points.");
		System.out.println("");
		System.out.println("There was " + SoccerTeam.gamesplayed() + " games played.");
		System.out.println("There was " + totalGoalsMade + " goals made.");
		
		SoccerTeam.startTournament();
		team1.resetPoints();
		team2.resetPoints();
		team3.resetPoints();
		team4.resetPoints();
		goalsScored1 = 0;
		goalsScored2 = 0;
		goalsScored3 = 0;
		goalsScored4 = 0;
		
		
		
		
		team1.played(team2, 5, 7 );
		 goalsScored1 = SoccerTeam.goalsmade();
		 team2.setOpponentWins(1);
		team3.played(team4, 5, 9);
		 goalsScored2 = SoccerTeam.goalsmade();
		team4.setOpponentWins(1);
		team1.played(team4, 12, 10);
		 goalsScored3 = SoccerTeam.goalsmade();
		team2.played(team3, 15, 10);
		 goalsScored4 = SoccerTeam.goalsmade();
		
		team1.tournamentPoints();
		team2.tournamentPoints();
		team3.tournamentPoints();
		team4.tournamentPoints();
		
		 totalGoalsMade = (goalsScored1 + goalsScored2 + goalsScored3 + goalsScored4);
		
		 System.out.println("");
		 System.out.println("Tournament 2");
		System.out.println("");
		System.out.println("Team 1 got " + team1.getPoints() + " points.");
		System.out.println("Team 2 got " + team2.getPoints() + " points.");
		System.out.println("Team 3 got " + team3.getPoints() + " points.");
		System.out.println("Team 4 got " + team4.getPoints() + " points.");
		System.out.println("");
		System.out.println("There was " + SoccerTeam.gamesplayed() + " games played.");
		System.out.println("There was " + totalGoalsMade + " goals made.");
		
		
	}
}
