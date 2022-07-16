package amazon;

public class Main {

	public static void main(String[] args) {
		
//		Book book1 = new Book ("Harry Potter", "JK Rowling", 10);
//		Book book2 = new Book ("Hitchhiker's Guide", "Douglas Adams", 12);
//		
//		System.out.println ("book1 : " + book1);
//		System.out.println ("book2 : " + book2);
//		
//		Computer comp1 = new Computer (1000, "8-core", "32-GB", "1TB" );
//		System.out.println ("comp1 : " + comp1);
		
		Item [] items = getInventory();
		for (Item i : items) {
			System.out.println (i.getDescription() + ", sale price : " + i.getPrice());
		}
		
	}
	
	static public Item[] getInventory () {
		Item [] items = new Item [] {
				new Book ("Harry Potter", "JK Rowling", 10),
				new Book ("Hitchhiker's Guide", "Douglas Adams", 12),
				new Computer (1000, "8-core", "32-GB", "1TB" ),
				new Computer (1500, "16-core", "64-GB", "2TB" ),
				new Camera (300, "Cannon"),
				new Camera (500, "Nikon")
		};
		
		return items;
		
	}

}
