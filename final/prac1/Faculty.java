



package uniproject;

public class Faculty {

  private int facultyid;
  private String facultyname;
  private String subject;
  private String doj;
  private String dob;
  private Address a;
 

  
  public Faculty () 
  { 
	this.facultyid=101;
	this.facultyname="XYZ";
	this.subject="SMD";
	this.doj="10/08/2016";
	this.dob="10/06/1982";  
	this.a=new Address(); // object of Address class as data member in Faculty Class (Aggregation)
	  
  };
  
 
  public void setFaculty(int facultyid, String facultyname, String subject, String doj, String dob)
  {
	  this.facultyid=facultyid;
	  this.facultyname=facultyname;
	  this.subject=subject;
	  this.doj=doj;
      this.dob=dob;
  }

  public void dispayFaculty()
  {
	  System.out.println("Faculty ID : "+facultyid);
	  System.out.println("Faculty Name : "+facultyname);
	  System.out.println("Faculty Subject : "+subject);
	  System.out.println("Faculty Date of Bitrth : "+dob);
	  System.out.println("Faculty Date of Joinining : "+doj);
	  System.out.println("Faculty Address is :  " );
	  a.dispalyAddress();
	  System.out.println("Faculty Tecaches to Student :");
	  Student S=new Student();
	  S.dispalyStudent(); // calling method of Student Class (Association)
	  
  }


}