

package uniproject;

public class University {

	  private String uniname;
	  private Department obj1;  // Object of Department Class as data member in university class (Aggregation)
	  private Department obj2;
	  
	  
	  public University () { 
		  uniname="SPPU";
		  obj1=new Department();
		  obj2=new Department();
		 
	  };
	  
	  public void setUniversity(String uniname)
	  {
		  this.uniname = uniname;
		  
	  }


	  public void DisplayUniversity()
	  {
		  System.out.println("University Name is : "+ uniname);
		  System.out.println("University is Having Following Departments : \n");
		  obj1.setDepartment(101, "IT", "Engineering", "01/06/2011","ABC");
		  obj2.setDepartment(102,"Computer Engg","Engineering", "10/06/2011","SSS");
		  obj1.displayDept();
		  obj2.displayDept();
	  }


	}