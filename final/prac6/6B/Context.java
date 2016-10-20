
import java.util.*;


/**
 * Class Context
 */
public class Context {

  public int balance;
  public String acc_no;
  private State state;
  
  public Context (int balance, String acc_no) 
  {
	  this.balance = balance;
	  this.acc_no = acc_no;
	  this.state = null; 
  }
  
  
  public void setBalance (int newVar) {
    balance = newVar;
  }

  
  public int getBalance () {
    return balance;
  }

  public void setAcc_no (String newVar) {
    acc_no = newVar;
  }

  public String getAcc_no () {
    return acc_no;
  }

  public void setState (State newVar) {
    state = newVar;
  }

  public State getState () {
    return state;
  }

}

//----------------------------------


import java.util.*;


/**
 * Interface State
 */
public interface State {

 public void changeState(Context context);

}

//-------------------------
public class Demo
{
  public static void main(String args[])
  {
	   Context con = new Context(1000, "Abc123");
	   
	   IdleState is = new IdleState();
	   is.changeState(con);
	   
	   OpenState os = new OpenState();
	   os.changeState(con);
	   
	   DepositedState ds = new DepositedState(500);
	   ds.changeState(con);
	   
	   WithdrawState ws = new WithdrawState(300);
	   ws.changeState(con);
	   
	   SuspendedState ss = new SuspendedState();
	   ss.changeState(con);
	   
	   ClosedState cs = new ClosedState();
	   cs.changeState(con);
  }
}


/*OUTPUT:
Account is in Idle State.
Account with account number Abc123 is in open state...
Amount 500 Deposited in Abc123
Current amount in Abc123 is 1500
* 
Amount 300 withdrawn from Abc123
Current amount in Abc123 is 1200
Account is now closed

*/


