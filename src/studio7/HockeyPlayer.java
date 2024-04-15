package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	//1 is right, 2 is left, 3 is either
	private int direction;
	//game completed?
	private boolean game;
	private int assists;
	private int goals;
	private int points;
	//number of games
	private int games;
	
	//only let you set name because i'm lazy
	public HockeyPlayer(String n) {
		name = n;
	}
	
	public void setNumber(int num) {
		number = num;
	}
	
	//hopefully they just put in a num! i guess i could set in string checking stuff but oh well
	public void setDirection(int dir) {
		direction = dir;
	}
	
	public boolean complete() {
		if(game) {
			games++;
		}
		return game;
	}
	
	public void setGame(boolean g) {
		game = g;
	}
	
	public void assist() {
		assists++;
	}
	
	public void goals() {
		goals++;
	}
	
	public int getPoints() {
		return assists + goals;
	}
	
	public void setPoints(int p) {
		points = p;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
