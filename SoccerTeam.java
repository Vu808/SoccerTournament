
public class SoccerTeam {

	private static int wins;
	private static int losses;
	private static int ties;
	private static int points;
	
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		if (myScore > opponentScore) {
			wins++;
		} if (myScore < opponentScore) {
			losses++;
		} if (myScore == opponentScore) {
			ties++;
		}
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
		this.losses = opponentWins;
	} 
	public void setOpponentLosses(int opponentLosses) {
		this.wins = opponentLosses;
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
	points = 0;
	
	}
}
