

package uniproject;

public class Course {

  private int courseid;
  private String coursename;
  
  public Course () 
  { 
	  this.courseid=2001;
	  this.coursename="Information Technology";
	  
  };
  
  public void setCourse(int courseid, String coursename)
  {
	  this.courseid=courseid;
	  this.coursename=coursename;
  }


    public void dispayCourse()
  {
    	System.out.println("Course ID : "+courseid);
    	System.out.println("Course Name : "+coursename + "\n");
  }

}