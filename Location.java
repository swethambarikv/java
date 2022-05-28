import java.util.ArrayList;
import java.util.Iterator;

public class Location {

	public int employeeLocation(String location) {
		ArrayList<String> allowance=new ArrayList<String>();//Creating arraylist  
		allowance.add("Chennai");
		{
		Iterator<String> itr=allowance.iterator();  
		while(itr.hasNext()){  
		System.out.println("Location of the Employee is:"+itr.next()); 
	}
}
		return 0;
}
}