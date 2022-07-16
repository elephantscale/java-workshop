class Point {
	int x,y;

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		myPrint("hello");
		myPrint (1);
		myPrint (Boolean.valueOf(true));
		myPrint (new Point());
	}

	public static <T> void myPrint (T x) {
		System.out.println (x);
	}

}
