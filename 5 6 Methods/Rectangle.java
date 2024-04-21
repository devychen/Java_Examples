/**
 Class that represents a rectangle.
 For demonstrating the need for private variables.
*/
public class Rectangle
{
    private int width; // so statement such as 'box.width = 6' is illegal
    private int height; 
	private int area;
	
    public void setDimensions(int newWidth, int newHeight)
    {
        width = newWidth;
        height = newHeight;
		area = width * height;
    }

    public int getArea()
    {
		return area;
	}
}
