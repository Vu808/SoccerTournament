
public class SoccerTeam {

	private static int wins;
	private static int losses;
	private static int ties;
	
	
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
	public void setOpponentWins(int opponentWins) {
		this.losses = opponentWins;
	} 
	public void setOpponentLosses(int opponentLosses) {
		this.wins = opponentLosses;
	} public void setOpponentTies(int opponentTies) {
		this.ties = opponentTies;
	}
	
}
