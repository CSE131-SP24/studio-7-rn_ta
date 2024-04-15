package studio7;

public class Complex {
	
	private double real;
	private double imag;
	
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImag() {
		return imag;
	}
	
	
	public Complex add(Complex other) {
		double newReal = real + other.getReal();
		double newImag = imag + other.getImag();
		Complex total = new Complex(newReal, newImag);
		return total;
	}
	
	public Complex mult(Complex other) {
		//(ac - bd)(ad + bc)
		double a = real;
		double c = other.getReal();
		double b = imag;
		double d = other.getImag();
		Complex total = new Complex(a*c - b*d, a*d + b*c);
		return total;
	}
	
	public static void main(String[] args) {
		

	}

}
