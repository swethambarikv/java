import java.util.Scanner;

public class EmployeeIDvalidation {
	public String  employeeID() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the user ID: ");
		String empid=scanner.next();
		try {
		if (empid.length() == 7) {
			
			String firsthalf = empid.substring(0, 3);
			String secondhalf = empid.substring(3, 7);
			Boolean employeenumber = firsthalf.contains("ACE");
			boolean flag=true;
			//Boolean id;
			int number = Integer.parseInt(secondhalf);
			if((number>0000)&&(number<=9999))
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
			if ((employeenumber == false)||(flag==false)) {
				System.out.println("Employee ID:" + empid);
				return employeeID();
			} else {
				//System.out.println("ID should contain ACE followed by a 4 digit number.");
				return empid;
			}
		}
		else
		{
			System.out.println("Id length should be 7");
			return employeeID();
		}
		}
		catch(NumberFormatException e)
		{e.printStackTrace();
		
		}

		return empid;

	}
}
