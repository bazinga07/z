

/**
 * Class ClosedState
 */
public class ClosedState implements State {

 
  public ClosedState () { };
  
  /**
   * @param        context
   */
  public void changeState(Context context)
  {
	  if((context.getState().toString() == "Withdraw State") || (context.getState().toString() == "Suspended State"))
      {
		  System.out.println("Account is now closed");
		  context.setState(this);
	  }
  }
  
  public String toString()
   {
	   return "Closed State";
   }



}
