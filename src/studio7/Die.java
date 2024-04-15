package studio7;

public class Die {

	// 1. private variable 
	private int sides;
	
	// 2. constructor 
	public Die(int sides) {
		this.sides = sides;
	}
	
	// 3. each time a die is thrown, a random variable is returned
	public int throwDie() {
		int random = (int) Math.random() * sides + 1;
		return random;
	}
	
	// 4. check the method 
	public static void main(String[] args) {
		int test = 5;
		Die iHateEclipse = new Die(test);
		System.out.print("throw: " + iHateEclipse.throwDie());

	}
	
}
