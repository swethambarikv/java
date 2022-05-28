import java.util.Scanner;

public class Emailvalidation {
	public String employeeMail() {

		System.out.println("Enter mail id:");
		Scanner scanner=new Scanner(System.in);
		String email=scanner.next();
		String regex = "^[a-z0-9+_.-]+@[a-z.-]+$";
		boolean result = email.matches(regex);
		if (result) {
			//System.out.println("Employee Email ID:" + email);
			return email;
		} else {
			System.out.println("Email ID should be lower case and should not have numbers in domain.");
			return employeeMail();
		}

	}
}
