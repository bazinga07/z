

/**
 * Class WithdrawState
 */
public class WithdrawState implements State {

  int amount;
  public WithdrawState (int amt) 
  {
	  this.amount = amt; 
  };
  
   /**
   * @param        context
   */
  public void changeState(Context context)
  {
	  if((context.getState().toString() == "Open State") || (context.getState().toString() == "Deposited State"))
      {
		  if(context.balance >= 500)
		  {
			   context.balance = context.balance - this.amount;
			   System.out.println("Amount "+amount+" withdrawn from "+ context.acc_no);
			   System.out.println("Current amount in "+ context.acc_no +" is "+ context.balance);
			   context.setState(this);
		  }
		  else
		  {
			  System.out.println("Insufficient Balance");
		  }
	  }
	  else
	  {
		  System.out.println("Amount cannot be withdrawn..");
	  }
  }
  
   public String toString()
   {
	   return "Withdraw State";
   }


}
