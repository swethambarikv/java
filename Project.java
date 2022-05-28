import java.util.Scanner;
public class Project extends Team{
	public void project() {
		Scanner sc=new Scanner(System.in);
		int choice;
		String role;
		double salary;
		System.out.println("Enter the Role of the Employee:");
		choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			salary=15000;
			role="Tester";
			/*System.out.println("Role of the employee is: Tester");
			System.out.println("Salary of the Employee is: 15000");*/

			break;

		case 2:
			salary=25000;
			role="Developer";
			/*System.out.println("Role of the employee is: Developer");
			System.out.println("Salary of the Employee is: 25000");*/
			
			break;

		case 3:
			salary=35000;
			role="Team Leader";
			/*System.out.println("Role of the employee is: Team Leader");
			System.out.println("Salary of the Employee is: 35000");*/
			
			break;

		case 4:
			salary=35000;
			role="Team Leader";

			//System.out.println("Role of the employee is: Project Manager");
			//System.out.println("Salary of the Employee is: 50000");
			
			break;

		case 5:
			salary=35000;
			role="Team Leader";

			//System.out.println("Role of the employee is: HR ");
			//System.out.println("Salary of the Employee is: 100000");
			
			break;
		case 6:
			salary=35000;
			role="Team Leader";

			//System.out.println("Role of the employee is: Technical Lead");
			//System.out.println("Salary of the Employee is: 75000");

			break;

		case 7:
			salary=35000;
			role="Team Leader";

			//System.out.println("Role of the employee is: Software Engineer");
			//System.out.println("Salary of the Employee is: 65000");
			
			break;

		case 8:
			salary=35000;
			role="Team Leader";

			//System.out.println("Role of the employee is: Software Developer");
			//System.out.println("Salary of the Employee is: 55000");
			
			break;

		case 9:
			//System.out.println("Role of the employee is: Chief Architect");
			//System.out.println("Salary of the Employee is: 200000");
			
			break;

		case 10:
			salary=35000;
			role="Team Leader";

			/*System.out.println("Role of the employee is: Product Manager");
			System.out.println("Salary of the Employee is: 300000");*/
			
			break;	
		default:
			role="Not Assigned";
			//System.out.println("Job Role is not assigned to the employee");
			
		}
	}

}
