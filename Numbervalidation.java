import java.util.Scanner;
import java.util.regex.*;
public class Numbervalidation {
	/*public static boolean isValidMobileNo(String number) {
		{
			Pattern ptrn = Pattern.compile("^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$");
			Matcher match = ptrn.matcher(number);
			return (match.find() && match.group().equals(number));
		}
	}
public int employeeMobileCheck(String number) {

		if (isValidMobileNo(number)) {
			System.out.println("Employee Phone number:" + number);
			return 1;
		} else {
			System.out.println("Mobile number should be in 10 digits and start with '9' or '8' or '7' or '6'.");
			return 0;
		}
	}*/
	public String employeeMobileCheck()
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter phone number: ");
	String employeePhno=scanner.next();
	Pattern pattern=Pattern.compile("^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$");
	Matcher matcher=pattern.matcher(employeePhno);
	boolean flag1=(matcher.find() && matcher.group().equals(employeePhno));
	if(flag1)
	{
		//System.out.println("Employee PhoneNo:"+employeePhno);
		return employeePhno;
	}
	else
	{
		System.out.println("Phone number should be of 10 digits only and start with 6,7,8,or 9");
	return employeeMobileCheck();
	}
}
}
