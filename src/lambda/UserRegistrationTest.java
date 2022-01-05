package lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();
	
	@Test
	public void firstNmaeTest() {
		assertEquals(true,userRegistration.checkName("Dinesh"));
	}
	

	@Test
	public void lastNameTest() {
		assertEquals(true,userRegistration.checkName("Kumar"));

	}
	

	@Test
	public void email() {
		assertEquals(false,userRegistration.email("dinesh@gmail.com"));

	}
	

	@Test
	public void password() {
		assertEquals(true,userRegistration.password("Dinesh1@"));

	}
}
