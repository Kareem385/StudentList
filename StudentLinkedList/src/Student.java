public class Student
{

private String FirstName; //Create a get and set method for each item.
private String LastName; //Create instance variables
private int id;
private double gpa;



public String getFirstName() { //Get method
	return FirstName;
}
	public void setFirstName(String FirstName) // set method
	{
this.FirstName = FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
public int getid()
{
	return id;
}
public void setid(int id)
{
this.id = id;
}
	
public double getgpa()
{
return gpa;
}
public void setgpa(double gpa)
{
this.gpa = gpa;
}


public void displayStudent()
	{
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("ID: " + this.getid());
		System.out.println("Gpa: " + this.getgpa());
	}




}	
	

