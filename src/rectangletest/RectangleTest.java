/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
		
		System.out.println("Rectangle details:");
		System.out.println("Length = " + r1.getLength());
		System.out.println("Width = " + r1.getWidth());
		System.out.println("Area = " + r1.calculateArea());
		System.out.println("Perimeter = " + r1.calculatePerimeter());
		}
	
	}
