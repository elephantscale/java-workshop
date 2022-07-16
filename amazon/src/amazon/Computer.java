package amazon;

public class Computer extends Item {
	String cpu, memory, disk;
	
	public Computer(int price, String cpu, String memory, String disk) {
		super(price);
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}

	@Override
	public String getDescription() {
		return "Computer [cpu:" + cpu + ", memory:" + memory + ", disk:" + disk + "]";
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", disk=" + disk + ", price=" + price + "]";
	}

}
