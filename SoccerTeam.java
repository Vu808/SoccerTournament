
public class SoccerTeam {

	private int wins;
	private  int losses;
	private  int ties;
	private  int points;
	private static int gamesplayed;
	private static int goals;
	
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		if (myScore > opponentScore) {
			wins++;
			
		} if (myScore < opponentScore) {
			losses++;
		} if (myScore == opponentScore) {
			ties++;
		}
		gamesplayed++;
		goals = myScore + opponentScore;
		}
		
	
	
	public int getWins() {
		return wins;
	} 
	public int getLosses() {
		return losses;
	}
	public int getTies() {
		return ties;
	}
	public int getPoints() {
		return points;
	}
	public void setOpponentWins(int opponentWins) {
		this.wins = opponentWins;
	} 
	public void setOpponentLosses(int opponentLosses) {
		this.losses = opponentLosses;
	} public void setOpponentTies(int opponentTies) {
		this.ties = opponentTies;
	}
	
	public int tournamentPoints() {
		int points;
		points = this.getWins() *3 + this.getTies();
		this.points = points;
		return points;
	}
	
	public void resetPoints() {
		wins = 0;
		losses = 0;
		ties = 0;
		points = 0;
	
	}
	
	public static int gamesplayed() {
		return gamesplayed;
	} 
	public static int goalsmade() {
		return goals;
	}
	
	public static void startTournament() {
		gamesplayed = 0;
		goals = 0;
	}
	
}
