

/**
 * Class OpenState
 */
public class OpenState implements State {

  
  public OpenState () { };
  
  /**
   * @param        context
   */
  public void changeState(Context context)
  {
	  if(context.getState().toString() == "Idle State")
	  {
	      if(context.balance >= 500)
	      {
		        System.out.println("Account with account number " + context.acc_no + "is in open state...");
		        context.setState(this);
	      }
	      else
	      {
			  System.out.println("Insufficient Balance");
		  }
	  }
	  else
	  {
		  System.out.println("Account should be in Idle State");
	  }
  }

   public String toString()
   {
	   return "Open State";
   }
}
