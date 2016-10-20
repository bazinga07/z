

/**
 * Class StopState
 */
public class StopState implements State {

 
  public StopState () { };
  
  /**
   * @param        context
   */
  public void doAction(Context context)
  {
	  System.out.println("Player is in stop state.");
	  context.setState(this);
  }

  public String toString()
  {
	  return " Stop State ";
  }
}
