public class Employeedetails {
	public String name;
	private String dob;
	private String gender;
	private String empid;
	public String doj;
	private String number;
	private String email;
	private String team;
	public String location;
//Getters & Setters
	/*public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}*/
	
	Employeedetails (String name,String gender,String empid,String doj,String dob,String number,String email,String team,String location)
	{
		this.name=name;
		this.empid=empid;
		this.gender=gender;
		this.number=number;
		this.dob=dob;
		this.doj=doj;
		this.email=email;
		this.team=team;
		this.location=location;
		
	}
	public Employeedetails()
	{
		
	}
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmpID() {
		return empid;
	}

	public void setEmpID(String empid) {
		this.empid = empid;
	}

	public String getDOJ() {
		return doj;
	}

	public void setDOJ(String doj) {
		this.doj = doj;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}