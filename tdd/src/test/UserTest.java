package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import x.User;

class UserTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void validUser () {
		new User ("Joe", 2000);
	}
	
	@Test
	void nullUserName() {
		Exception ex = assertThrows(NullPointerException.class, 
				() -> {
					new User (null, 20);
				}
				);
		
		 String excMsg = ex.getMessage();
		 assert excMsg.toLowerCase().contains("userid") : excMsg;
	}
	
	@Test
	void getGeneration() {
		fail("Not yet implemented");
	}

}
