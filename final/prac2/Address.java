


package uniproject;


public class Address {

  private int flatno;
  private String buildingname;
  private String streetname;
  private String landmark;
  private long pincode;
  private String state;
  
  
  public Address () 
  { 
	  this.buildingname="Sonigara";
	  this.flatno=101;
	  this.landmark="near abc chowk";
	  this.streetname="dehuroad";
	  this.pincode=412101;
	  this.state="maharashtra";
	  
  };
  
 
  public void setAddress(int flatno, String buildingname, String streetname, String landmark, long pincode, String state)
  {
	  this.buildingname=buildingname;
	  this.flatno=flatno;
	  this.landmark=landmark;
	  this.streetname=streetname;
	  this.pincode=pincode;
	  this.state=state;
  }

  public void dispalyAddress()
  {
	  System.out.println("Falt No. : "+flatno);
	  System.out.println("Building Name : "+buildingname);
	  System.out.println("Landmark : "+landmark);
	  System.out.println("Street Name : "+streetname);
	  System.out.println("pincode : "+pincode);
	  System.out.println("state : "+state);
  }


}


