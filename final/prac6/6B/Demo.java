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


/*
uttu@uttu-SVF15212SNB:~/sem7/SMD/Ass6B$ java Demo
Account is in Idle State.
Account with account number Abc123 is in open state...
Amount 500 Deposited in Abc123
Current amount in Abc123 is 1500
* 
Amount 300 withdrawn from Abc123
Current amount in Abc123 is 1200
Account is now closed

*/
