/*
 * This is a test program to learn how to use Git from within NetBeans.
 */
package rectangletest;

/**
 *
 * @author Aaron
 */
public class RectangleTest
	{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
		{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7, 42);
		
		System.out.println("Rectangle 1 details:");
		System.out.println("Length = " + r1.getLength());
		System.out.println("Width = " + r1.getWidth());
		System.out.println("Area = " + r1.calculateArea());
		System.out.println("Perimeter = " + r1.calculatePerimeter());
		
		System.out.println("\nRectangle 2 details:");
		System.out.println("Length = " + r2.getLength());
		System.out.println("Width = " + r2.getWidth());
		System.out.println("Area = " + r2.calculateArea());
		System.out.println("Perimeter = " + r2.calculatePerimeter());
		}//end of main
	
	}//end of class RectangleTest
