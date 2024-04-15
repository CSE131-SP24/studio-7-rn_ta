package studio7;

import java.util.Scanner;

public class Rectangle {

	// 1. create a private variable
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	// 2. constructor
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
		area = 0;
		perimeter = 2 * this.length + 2 * this.width;
	}
	
	// 3. area getter
	public int getArea() {
		area = length * width;
		return area;
	}
	
	// 4. perimeter getter
	public int getPerimeter() {
		perimeter = 2 * length + 2 * width;
		return perimeter;
	}
	
	// 5. smaller than another rectangle in terms of area
	public boolean smaller(Rectangle r) {
		if(this.area < r.getArea()) {
			return true;
		}
		return false;
	}
	
	// 6. is it a square?
	public boolean square() {
		return length == width;
	}
	
	// 7. way to check 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("length: ");
		int l = in.nextInt();
		System.out.println("");
		
		System.out.print("width: ");
		int w = in.nextInt();
		
		Rectangle hello = new Rectangle(l, w);
		System.out.println("area: " + hello.getArea());
		System.out.println("perimeter: " + hello.getPerimeter());
		
		//test smaller and square blah blah blah
	}
	
}
