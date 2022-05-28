import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayEmployeeDetails {
	jdbc data=new jdbc();
	Scanner sc = new Scanner(System.in);
	ArrayList<Employeedetails>employeedetails=new ArrayList<Employeedetails>();
	
	public void display () throws Exception
	{
		// input and setters
		
		System.out.println("           **********************  WELCOME TO ASPIRE SYSTEMS!!!   ********************");
		System.out.println("           **********************  EMPLOYEE MANAGEMENT SYSTEM     *********************");
		int choice;
		do
		{
			System.out.println("1.CREATE");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.DISPLAY");
			System.out.println("***********************************************************************************");
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			System.out.println("***********************************************************************************");
			if(choice==1)
			{
				employeedetails.add(create());
			}
			else if(choice==2)
			{
				try {
				update();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else if(choice==3)
			{
				try
				{
				delete();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else if(choice==4)
			{
				try {
				data.show();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("THANK YOU");
			}
				
		}while(choice!=4);
	}
		public Employeedetails create() throws ParseException
		{
			
			Employeedetails emp = new Employeedetails();
		// name input setter
		Namevalidation empname = new Namevalidation();
		 String ename=empname.employeeNameCheck();
		System.out.println("--------------------------");
		
		// DoB input setter
		Dobvalidation birth = new Dobvalidation();
		String edob=birth.employeeAge();
		System.out.println("--------------------------");
		
		EmployeeIDvalidation id = new EmployeeIDvalidation();
		String eid=id.employeeID();
		
		System.out.println("--------------------------");
		
		DOJvalidation join = new DOJvalidation();
		String edoj=join.employeeDate();
		
		System.out.println("--------------------------");
		// Mobile No input setter
		
		Numbervalidation num = new Numbervalidation();
		String enumber=num.employeeMobileCheck();
		
		System.out.println("--------------------------");
		// Email-Id input setter
		
		Emailvalidation mail = new Emailvalidation();
		String emailid=mail.employeeMail();
		
		System.out.println("--------------------------");
		try {
		 data.insertdatabase(ename,eid,emailid,enumber,edob,edoj);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
		}

		public void delete() throws Exception
		{

			String id=sc.next();
			
			int index=data.isAvailable(id);
			//System.out.println("index is"+index);
			if(index>=1)
			{
				data.delete(id);
			}
			else
			{
				System.out.println("given employeeid  does not exist");
			}
		}
		public void update() throws Exception
		{
			System.out.println("Enter the ID:");
			String id=sc.next();
			int index=data.isAvailable(id);
			System.out.println("index is "+ index);
			if(index>=1)
			{
				data.update(id);
			}
			else
			{
				System.out.println("given employeeid  does not exist");
			}
			}
}
			
		/*// Validation
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("           ********************   Details of the Employee!!!   ************************");
		Namevalidation employeename = new Namevalidation();
		empname.employeeNameCheck();
		System.out.println("--------------------------");
		Dobvalidation birth = new Dobvalidation();
		birth.employeeAge(emp.getDob());
		System.out.println("--------------------------");
		EmployeeIDvalidation id = new EmployeeIDvalidation();
		id.employeeID(emp.getEmpID());
		System.out.println("--------------------------");
		DOJvalidation join = new DOJvalidation();
		join.employeeDate(emp.getDOJ());
		System.out.println("--------------------------");
		Numbervalidation num = new Numbervalidation();
		num.employeeMobileCheck(emp.getNumber());
		System.out.println("--------------------------");
		Emailvalidation mail = new Emailvalidation();
		mail.employeeMail(emp.getEmail());
		System.out.println("--------------------------");
		Location p1=new Location();
		p1.employeeLocation(emp.getLocation());
		System.out.println("--------------------------");
		Java obj=new Java();
		obj.project();
		System.out.println("--------------------------");
		Project p=new Project();
		p.project();
		System.out.println("--------------------------");
		WorkofEmployee m=new WorkofEmployee();  
		m.run();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	
		
		return 0;
		


	
}
}*/
