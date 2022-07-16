package x;

public class Rectangle implements Shape {
	int length, width;
	String color;
	

	public Rectangle(int length, int width, String color) {
		//super();
		this.length = length;
		this.width = width;
		this.color = color;
	}

	@Override
	public int getSize() {
		return length * width;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + "]";
	}

	@Override
	public void display() {
		System.out.println ("in Rectangle.display()");
	}

}
