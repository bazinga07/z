

/**
 * Class DepositedState
 */
public class DepositedState implements State {

  int amount;
  public DepositedState (int amount) 
  {
	  this.amount = amount; 
  };
  
    /**
   * @param        context
   */
  public void changeState(Context context)
  {
	   if(context.getState().toString() == "Open State")
	   {
		   if(this.amount >= 100)
		   {
			   context.balance = context.balance + this.amount;
			   System.out.println("Amount "+amount+" Deposited in "+ context.acc_no);
			   System.out.println("Current amount in "+ context.acc_no +" is "+ context.balance);
			   context.setState(this);
		   }
		   else
		   {
			   System.out.println("Insufficient Amount....");
		    }
	   }
	   else
	   {
		   System.out.println("Account should be in open state....");
	   }
  }
 
  public String toString()
   {
	   return "Deposited State";
   }

}
