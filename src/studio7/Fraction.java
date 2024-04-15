package studio7;

public class Fraction {

	// 1. private variable 
	private int numerator;
	private int denominator;
	
	// 2. constructor 
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	
	// 3. get numerator
	public int getNum() {
		return numerator;
	}
	
	// 4. get denom
	public int getDenom() {
		return denominator;
	}
	
	// 5. addition 
	public Fraction add(Fraction other) {
		int newNum1 = numerator * other.getDenom();
		int newNum2 = other.getNum() * denominator;
		int finalNum = newNum1 + newNum2;
		Fraction total = new Fraction(finalNum, denominator * other.getDenom());
		return total;
	}
	
	// 6. subtraction 
	public Fraction subtract(Fraction other) {
		int newNum1 = numerator * other.getDenom();
		int newNum2 = other.getNum() * denominator;
		int finalNum = newNum1 - newNum2;
		Fraction total = new Fraction(finalNum, denominator * other.getDenom());
		return total;
	}
	
	// 7. multiplication 
	public Fraction multiply(Fraction other) {
		Fraction total = new Fraction(numerator * other.getNum(), denominator * other.getDenom());
		return total;
	}
	
	// 8. division 
	public Fraction divide(Fraction other) {
		Fraction total = new Fraction(numerator * other.getDenom(), denominator * other.getNum());
		return total;
	}
	
	// 9. simplification 
	public Fraction simplify() {
		//dont want to directly edit
		int num = numerator;
		int denom = denominator;
		
		int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
        	//go when divisible (at gcd)
            while (num % i == 0 && denom % i == 0) {
                num /= i;
                denom /= i;
                smaller = Math.min(num, denom);
            }
        }
		
		Fraction total = new Fraction(num, denom);
		return total;
	}

	// 10. check 
	public static void main(String[] args) {
		Fraction a = new Fraction(12,8);
		Fraction simplified = a.simplify();
		System.out.print(simplified.getNum() + "/" + simplified.getDenom());

	}
	
}
