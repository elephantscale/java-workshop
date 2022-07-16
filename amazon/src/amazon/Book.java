package amazon;

@SuppressWarnings("unused")
public class Book extends Item {
	String title, author;
	
	String x;
	
	public Book (String title, String author, int price) {
		super(price);
		this.title = title;
		this.author = author;
		
		int x;
	}

	@Override
	public String getDescription() {
		int x;
		return "Book [title: " + title + ", author: " + author + "]";
	}
	

	@Override
	public int getPrice() {
		return this.price / 2;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
