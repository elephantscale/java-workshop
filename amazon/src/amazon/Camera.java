package amazon;

public class Camera extends Item {
	String make;

	public Camera(int price, String make) {
		super(price);
		this.make = make;
	}

	@Override
	public String getDescription() {
		return "Camera [make:" + make + "]";
	}

	@Override
	public int getPrice() {
		return (int)(price * 0.8);
	}

}
