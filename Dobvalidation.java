
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Dobvalidation {

	public String employeeAge()  {
		// TODO Auto-generated method stub
		System.out.println("Enter Date of birth:");
		Scanner scanner=new Scanner(System.in);
		String employeeDob=scanner.next();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate dateofBirth = LocalDate.parse(employeeDob);
		
		//Checks the age of employee 
		int employeeAge=ageCalculate(dateofBirth);
		if((employeeAge>18) && (employeeAge<60))
		{
			return employeeDob;
		}
		else {
			System.out.println("Employee Age should be above 18 and below 60.");
			return employeeAge();
		}
	}
	// Returns age given the date of birth
		public static int ageCalculate(LocalDate dob) 
		{
		        LocalDate currentDate = LocalDate.now();
		       // String cDate=currentDate.toString();
		        if(dob.compareTo(currentDate)>=0)
		        {
		            System.out.println("Employee's age is invalid.");
		        }
		        else
		        {
		        return Period.between(dob, currentDate).getYears();
		        }
		        return 0;
}
}
