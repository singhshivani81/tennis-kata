package tennis_kata.socgen;

public class Points {
	String[] scores = { "0", "15", "30", "40", Constants.WIN };
	
	
	public String pointsNoDuece(int totalPoints) {
		return scores[totalPoints];
	}

}
