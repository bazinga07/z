

/**
 * Class IdleState
 */
public class IdleState  implements State {

  public IdleState () { };
  
 
  /**
   * @param        context
   */
  public void changeState(Context context)
  {
	  context.setState(this);
	  System.out.println("Account is in Idle State.");
  }

   public String toString()
   {
	   return "Idle State";
   }
}

//-----------------------------------------




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

//----------------------------------------------



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

//-------------------------------------------



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

//----------------------------------------------



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

//---------------------------------------------



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
