

/**
 * Class SuspendedState
 */
public class SuspendedState implements State {

  public SuspendedState () { };
  
  /**
   * @param        context
   */
  public void changeState(Context context)
  {
	  if(context.getState().toString() == "Open State")
      {
		  System.out.println("Account is now suspended..");
		  context.setState(this);
	  }
  }

   public String toString()
   {
	   return "Suspended State";
   }

}
