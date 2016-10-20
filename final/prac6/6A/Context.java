
import java.util.*;
/**
 * Class Context
 */
public class Context {

  private State state;
  
  public Context () 
  { 
	  state = null; 
  }
  
   /**
   * Set the value of state
   * @param newVar the new value of state
   */
  public void setState (State newVar) {
    state = newVar;
  }

  /**
   * Get the value of state
   * @return the value of state
   */
  public State getState () {
    return state;
  }
}

/------------------------------



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

/----------------------------------



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
/-----------------------------------


import java.util.*;


/**
 * Interface State
 */
public interface State {

  /**
   * @param        context
   */
  public void doAction(Context context);


}

