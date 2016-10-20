

package uniproject;

public class Student {

 private int rollno;
 private String name;
 
public Student ()
{ 
	this.rollno=1001;
	this.name="XYZ";
};
 
 
 public void setStudent(int rollno, String name)
 {
	 this.rollno=rollno;
	 this.name=name;
 }

 public void dispalyStudent()
 {
	 System.out.println("Roll no. : "+rollno);
	 System.out.println("Name : "+name);
	 System.out.println("Deatils of Course Taken is :");
	 Course C=new Course();  
	 C.dispayCourse(); //Calling method of course class in student class (Association)
	 
 }


}
