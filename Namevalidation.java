
//Exception Handling
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Namevalidation {
	public String employeeNameCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = scanner.nextLine();
		
		int flag=0;
		Pattern pattern=Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher=pattern.matcher(name);
		//Checks for special characters
		boolean isNameContainsSplChar=matcher.find();
		//Checks for more than 2 consecutive repeated characters
		for(int iteration=1;iteration<name.length();iteration++)
		{
			
				if(name.charAt(iteration-1)==name.charAt(iteration)&& name.charAt(iteration+1)==name.charAt(iteration))
				{
						flag=1;
						break;
					
				}
			
		}
		if(isNameContainsSplChar==true)
		{
			  System.out.println("No special characters allowed");
		      // System.out.println("Enter valid name:");
		      employeeNameCheck();
		    
		     }
		    else if(flag==1)
		    {
		        System.out.println("Not more than 2 consecutive characters allowed");
		        employeeNameCheck();
		    }
		    
		   /* else{
		        System.out.println("Employee Name:"+employeeName+"\n");
		    }*/
			
			//scanner.close();
			return name;
		}
}