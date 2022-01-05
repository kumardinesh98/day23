package lambda;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PUserRegistration {
	
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailId;
	private String password;

	private String expectedFirstName;
	private String expectedLastName;
	private String expectedForNumber;
	private String expectedForEmail;
	private String expecteForPassword;
	
	private UserRegistration userRegistration ;
	

	public PUserRegistration(String firstName, String lastName, String contactNumber, String emailId,
			String password, String expectedFirstName, String expectedLastName, String expectedForNumber,
			String expectedForEmail, String expecteForPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.expectedFirstName = expectedFirstName;
		this.expectedLastName = expectedLastName;
		this.expectedForNumber = expectedForNumber;
		this.expectedForEmail = expectedForEmail;
		this.expecteForPassword = expecteForPassword;
	}


	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}
	

	@Parameterized.Parameters
	public static Collection parameter() {
		return Arrays.asList(new Object[][] { { "", "", "", "","","invalid", "invalid", "invalid", "invalid", "invalid" },
				{ "Dinesh", "Kumar", "91 7200762705", "abc.xyz@bl.co.in", "Dinesh1@","valid","valid", "valid", "valid", "valid" } });
	}
	 
	
	@Test
	public void firstNmaeTest() {
		assertEquals(expectedFirstName,userRegistration.checkName(firstName));
	}
	

	@Test
	public void lastNameTest() { 
		assertEquals(expectedLastName,userRegistration.checkName(lastName));

	}
	
	@Test
	public void number() {
		assertEquals(expectedForNumber,userRegistration.mobileNum(contactNumber));

	}


	@Test
	public void email() {
		assertEquals(expectedForEmail,userRegistration.email(emailId));

	}
	

	@Test
	public void password() {
		assertEquals(expecteForPassword,userRegistration.password(password));

	}
}
