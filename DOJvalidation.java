

import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;

public class DOJvalidation {
	

	public String employeeDate() {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date of joining:");
		String employeeDoj=scanner.nextLine();
		LocalDate dateofjoining = LocalDate.parse(employeeDoj);
		int localdate=experience(dateofjoining);
		//int experience = currentyear - yeardoj;
		if (localdate >= 0) {
			//System.out.println("InValid Date");
			return employeeDoj;
		} else {
			//System.out.println("Experience is:(in yrs)" + experience);
			return employeeDate();
		}


	}
	public static int experience(LocalDate doj) 
    {
        LocalDate currentDate = LocalDate.now();
        if(doj.compareTo(currentDate)>0)
        {
            System.out.println("Invalid date of joining. DOJ cannot be future dates.");
        }
        else
        {
        return Period.between(doj, currentDate).getYears();
        }
    return 0;
}
		
	}


