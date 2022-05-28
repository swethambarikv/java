import java.sql.*;
public class jdbc {
	private String url="jdbc:mysql://localhost:3306/employeemanagement";
	private String  username="root";
	private String password="swetha27@root";
	
	public void insertdatabase(String employeename,String employeeid,String employeemailid,String employeephone,
			String employeedob,String employeedoj) throws Exception
		{
		
			 String query="insert into employeemanagement.employeedata values(?,?,?,?,?,?)";
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection connection=DriverManager.getConnection(url,username,password);
			 PreparedStatement statement=connection.prepareStatement(query);
			
			 statement.setString(1, employeename);
			 statement.setString(2, employeeid);
			 statement.setString(3, employeemailid);
			 statement.setString(4, employeephone);
			 statement.setString(5, employeedob);
			 statement.setString(6, employeedoj);
			
			 
			 int count=statement.executeUpdate();
			 System.out.println(count +" rows affected");
			 System.out.println("Data entered successfully!!!\n");
			
		}

	public void show() throws Exception
		{
			String query="select * from employeemanagement.employeedata;";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
				
			String output="";
			while(resultset.next())
				{
					output=("------EMPLOYEE DETAILS OF "+resultset.getString(1).toUpperCase()+"-----"
					+"\n"+" NAME: "+resultset.getString(1).toUpperCase()
					+"\n"+" ID: "+resultset.getString(2)
					+"\n"+" MAIL ID: "+resultset.getString(3)
					+"\n"+" PHONE NO: "+resultset.getString(4)
					+"\n"+" DATE OF BIRTH: "+resultset.getString(5)
					+"\n"+" DATE OF JOINING: "+resultset.getString(6));
					/*+"\n"+" TEAM: "+resultset.getString(7).toUpperCase()
					+"\n"+" SALARY: Rs." +resultset.getDouble(8)+"\n");*/
					System.out.println(output);
					System.out.println("***********************************************************************************");
				}
				
		}
	public int isAvailable( String employeeid)  throws Exception
		{
			String query="select count(*) as rowcount from employeemanagement.employeedata where employeeid = '"+employeeid+"';";
			int count=0;
						
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
			
			resultset.next();
			count=resultset.getInt("rowcount");
			return count;
					
		}
	
	public void delete(String employeeid)
		{
			String query="delete from employeemanagement.employeedata where employeeid= '"+employeeid+"';";
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
	
			
			int deleted= statement.executeUpdate(query);
			System.out.println(deleted +" rows deleted");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	public void update(String employeeid)
	{
		
		String query="update employeemanagement.employeedata set employeename='Swethambari',employeemailid='swethambarikv@gmail.com',employeephone='9756842310',employeedob='2000-01-27',employeedoj='2020-06-20' where employeeid='ACE1234'";
		//String query="insert into employee.employeeinfo values(?,?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			
			/* statement.setString(1, name);
			 statement.setString(2, id);
			 statement.setString(3, mailid);
			 statement.setString(4, phno);
			 statement.setString(5, dob);
			 statement.setString(6, doj);
			 statement.setString(7, team);
			 statement.setDouble(8, salary);*/
			
			int updated=statement.executeUpdate(query);
			System.out.println(updated + " rows updated");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
