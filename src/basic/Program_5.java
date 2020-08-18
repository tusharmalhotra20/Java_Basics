package basic;

import java.util.* ;

public class Program_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		float l, b, ar, pr ;
		
		System.out.print("Enter Length of rectangle:\t");
		l = sc.nextFloat() ;
		
		System.out.print("Enter Breadth of rectangle:\t");
		b = sc.nextFloat();
		
		pr = 2 * (l + b) ;
		ar = l * b ;
		
		System.out.println("The perimeter of recatngle is:\t" + pr) ;
		System.out.println("The area of rectangle is:\t" + ar) ;
				
	}

}
