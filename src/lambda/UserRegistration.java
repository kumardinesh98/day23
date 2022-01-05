package lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		UserRegistration userRegistration = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		
		String nameFirst = null;
		String nameSecond = null;
		String eMailId = null;
		String mobileNumber = null;
		String password = null;
		
		while(nameFirst == null) {
			System.out.println("enter rthe first name");
			String firstName= scanner.nextLine();
			IValidate validate = (String name) -> {
				try {
					String validName ="^[A-Z]+[a-z]{3,}";
					Pattern compiledName = Pattern.compile(validName);
					Matcher pinmatcher = compiledName.matcher(name);
					if (pinmatcher.matches()) {
						return name;
					} else {
						throw new Exception();

					}
				}
				catch (Exception e){
					e.getStackTrace();
					System.out.println("please enter a valid information");
					return null;
				}
			};
			nameFirst = validate.validation(firstName);
		}
		
		
		while (nameSecond == null) {
			
			System.out.println("enter the second name");
			String secondName = scanner.nextLine();
			
			IValidate validate = (String name) -> {
				try {
					String validName ="^[A-Z]+[a-z]{3,}";
					Pattern compiledName = Pattern.compile(validName);
					Matcher pinmatcher = compiledName.matcher(name);
					if (pinmatcher.matches()) {
						return name;
					} else {
						throw new Exception();
	
					}
				}
				catch (Exception e){
					e.getStackTrace();
					System.out.println("please enter a valid information");
					return null;
				}
			};
			nameSecond = validate.validation(secondName);
		}
	
		
		while (eMailId == null) {
			System.out.println("enter the email id");
			String emailId = scanner.nextLine();
			IValidate validate = (String name) -> {
				try {	
				String validEmail = "^abc+.[a-z]*[@bl.co]+[.a-z]*";
				Pattern compiledName = Pattern.compile(validEmail);
				Matcher pinmatcher = compiledName.matcher(emailId);
				if (pinmatcher.matches()) {
					return emailId;
				} else {
					throw new Exception();
				}
				}
				catch (Exception e){
					e.getStackTrace();
					System.out.println("please enter a valid information");
					return null;
				}
			};
		eMailId = validate.validation(emailId);
		}
		
		while (mobileNumber == null) {
			System.out.println("enter the mobile number");
			String mobile = scanner.nextLine();
			IValidate validate = (String number) -> {
				try {
				String validNumber = "[91]+\s[0-9]{10}";
				Pattern compiledName = Pattern.compile(validNumber);
				Matcher pinmatcher = compiledName.matcher(number);
				if (pinmatcher.matches()) {
					return mobile;
				} else {
					throw new Exception();

				}
				}
				catch (Exception e){
					e.getStackTrace();
					System.out.println("please enter a valid information");
					return null;
				}
			};	
			mobileNumber = validate.validation(mobile);
		}
		
		while (password == null ) {
			System.out.println("enter the password");
			String userPassword = scanner.nextLine();
			IValidate validate = (String usePassword) -> {
				try {
					String validPassword = "^.*(?=.{8})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1}).*$";
					Pattern compiledPassword = Pattern.compile(validPassword);
					Matcher pinmatcher = compiledPassword.matcher(usePassword);
					if (pinmatcher.matches()) {
						return usePassword;
					} else {
						
						throw new Exception();
					}
				}
				catch (Exception e){
					e.getStackTrace();
					System.out.println("please enter a valid information");
					return null;
				}
		   };
			password = validate.validation(userPassword);

		}
		System.out.println("registration sucessfull");
	}
	
	
}

