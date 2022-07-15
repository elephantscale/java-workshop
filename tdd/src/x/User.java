package x;

public class User {
	private String userId;
	private int birthYear;
	
//	public User(String userId, int age) 
//		super();
//		this.userId = userId;
//		this.age = age;
//	}

	
	public User(String userId, int birthYear)  {
		super();
		if (userId == null) throw new NullPointerException ("userid can not be null");
		this.userId = userId;
		this.birthYear = birthYear;
	}

	public String getGeneration ( ) {
		// TODO: fix this to return correct generation type
		// https://en.wikipedia.org/wiki/Generation_X#/media/File:Generation_timeline.svg
		return "X";
	}

}
