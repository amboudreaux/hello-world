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
public class Rectangle
	{
	private int length;
	private int width;
	
	public Rectangle(int length, int width)
		{
		this.length = length;
		this.width = width;
		}
	
	public Rectangle()
		{
		this.length = 1;
		this.width = 1;
		}
	
	public int getLength()
		{
		return length;
		}
	
	public int getWidth()
		{
		return width;
		}
	
	public void setLength(int newLength)
		{
		length = newLength;
		}
	
	public void setWidth(int newWidth)
		{
		width = newWidth;
		}
	
	public int calculateArea()
		{
		return length * width;
		}
	
	public int calculatePerimeter()
		{
		return 2 * width + 2 * length;
		}
	}
