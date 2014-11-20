

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class StudentList 
{
public static void main(String [] args)
{
	Scanner keyboard= new Scanner(System.in);
	
	LinkedList course = new LinkedList(); //created linked-list object.
	ListIterator iterator = course.listIterator(); //created iterator.
	
	
	int i; //for id
	double g; //for grade point average.
	String fName, LName;
	
	
System.out.println("Begin entering student info..");
System.out.println("Enter student id, or -1 to quit.");



i = keyboard.nextInt();
while(i != -1)
{
Student x = new Student(); //Have to create a student object.

x.setid(i); //using the set method from the student class.
System.out.println("Enter firstname");
fName = keyboard.nextLine();
x.setFirstName(fName); //using set method from student class to set name.

System.out.println("Enter lastname");
LName = keyboard.nextLine();
x.setLastName(LName);

System.out.println("Enter gpa");
g = keyboard.nextDouble();
x.setgpa(g);

course.addFirst(x); //Have to add the object created to the linked list.


System.out.println("Enter student id or -1 to quit.");
i = keyboard.nextInt();


}

iterator = course.listIterator();
while(iterator.hasNext())
{
Student x = (Student) iterator.next(); //
x.displayStudent();

}
System.out.println("Size is:" +course.size());




	
}
}