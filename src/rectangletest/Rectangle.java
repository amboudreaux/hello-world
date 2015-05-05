/*
 * This is a simple class used to introduce students to the idea of an object class.
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
