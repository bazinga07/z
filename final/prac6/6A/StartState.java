

/**
 * Class StartState
 */
public class StartState implements State {

 public StartState () { };
  
   /**
   * @param        context
   */
  public void doAction(Context context)
  {
	  System.out.println("Player is in start state.");
	  context.setState(this);
  }

  public String toString()
  {
	  return " Start State ";
  }
}
