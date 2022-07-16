package x;

public class Circle implements Shape {
	
	int radius;
	String color;
	
	public Circle(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	@Override
	public int getSize() {
		return 2*radius; // TODO: fix later
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void display() {
		System.out.println ("In Circle.display()");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}
