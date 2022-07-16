package amazon;

public abstract class Item {
	int price;
	
	public Item(int price) 	{
		this.price = price;
	}
	
	abstract public String getDescription();
	abstract public int getPrice();

}
