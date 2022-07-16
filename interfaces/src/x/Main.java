package x;

public class Main {

	public static void main(String[] args) {
//		Rectangle rect1 = new Rectangle(10,20, "red");
//		System.out.println ("rect1 : " + rect1);
//		
//		Circle circle1 = new Circle(5, "blue");
//		System.out.println ("circle1 : " + circle1);
		
		// interfaces
		Shape [] shapes = new Shape [3];
		shapes[0] = new Rectangle(100, 200, "green");
		shapes[1] = new Circle (100, "yellow");
		shapes[2] = new Rectangle (25, 50, "black");
		
		for (Shape s : shapes) {
			s.display();
		}

	}

}
