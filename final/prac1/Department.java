

package uniproject;


public class Department {

 private int deptno;
 private String deptname;
 private String depttype;
 private String deptsdate;
 private String deptchod;
 private Faculty f1,f2; // object of Faculty Class as Data Members in Department Class (Aggregation)
 

 public Department () { 
	 this.deptno = 1;
	 this.deptname="IT";
	 this.depttype= "Engineering";
	 this.deptsdate ="01/06/2016";
	 this.deptchod="xyz";
	 f1=new Faculty();
	 f2=new Faculty();
	 
 };
 
 
 public void setDepartment(int deptno, String deptname, String depttype, String deptsdate, String deptchod)
 {
	 this.deptno=deptno;
	 this.deptname=deptname;
	 this.depttype=depttype;
	 this.deptsdate=deptsdate;
	 this.deptchod=deptchod;
	 
 }


 public void displayDept()
 {
	 System.out.println("Department No : "+deptno);
	 System.out.println("Department name : "+deptname);
	 System.out.println("Department Type: "+depttype);
	 System.out.println("Department Start Date : "+deptsdate);
	 System.out.println("Department Current HOD : "+deptchod +"\n");
	 
 }
 
 public void deptFaculty()
 {
	 System.out.println("Depatment Contians Following Faculty Members");
	 f1.setFaculty(101, "ABC", "OOAD", "16/08/2016","10/01/2008");
	 f2.setFaculty(201,"PQR", "SMD", "10/08/2016", "10/07/1982");
	 f1.dispayFaculty();
	 f2.dispayFaculty();
 }
 
}

