/*
 * StatePatternDemo.java
 * 
 * Copyright 2016 uttu <uttu@uttu-SVF15212SNB>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class StatePatternDemo {
	
	public static void main (String args[]) 
	{
	    Context con = new Context();
	    
	    StartState st = new StartState();
	    st.doAction(con);
	    
	    System.out.println(con.getState().toString())	;
	    
	    StopState stop = new StopState();
	    stop.doAction(con);
	    
	    System.out.println(con.getState().toString())	;
	}
}

/*
 *uttu@uttu-SVF15212SNB:~/sem7/SMD/Ass6$ java StatePatternDemo 
 *Player is in start state.
 *Start State 
 *Player is in stop state.
 *Stop State 
 * */
