/**
 * 
 */
package edu.ncsu.csc216.backlog.task;

import edu.ncsu.csc216.backlog.command.Command;

/**
 * @author wbooth
 *
 */
public class TaskItem {

	
	/**
	 * Interface for states in the Task State Pattern.  All 
	 * concrete task states must implement the TaskState interface.
	 * 
	 * @author Dr. Sarah Heckman (sarah_heckman@ncsu.edu) 
	 */
	private interface TaskItemState {
		
		/**
		 * Update the {@link TaskItem} based on the given {@link Command}.
		 * An {@link UnsupportedOperationException} is throw if the {@link CommandValue}
		 * is not a valid action for the given state.  
		 * @param c {@link Command} describing the action that will update the {@link TaskItem}'s
		 * state.
		 * @throws UnsupportedOperationException if the {@link CommandValue} is not a valid action
		 * for the given state.
		 */
		void updateState(Command c);
		
		/**
		 * Returns the name of the current state as a String.
		 * @return the name of the current state as a String.
		 */
		String getStateName();
	
	}
	
	/**
	 * Represents the state where a task is in the Backlog State.
	 * @author wbooth
	 *
	 */
	private class BacklogState {
		
	}
	
	/**
	 * Represents the state where a task is in the Owned State.
	 * @author wbooth
	 *
	 */
	private class OwnedState {
		
	}
	
	/**
	 * Represents the state where a task is in the Processing State.
	 * @author wbooth
	 *
	 */
	private class ProcessingState {
		
	}
	
	/**
	 * Represents the state where a task is in the Verifying State.
	 * @author wbooth
	 *
	 */
	private class VerifyingState {
		
	}
	
	/**
	 * Represents the state where a task is in the Done State.
	 * @author wbooth
	 *
	 */
	private class DoneState {
		
	}
	
	/**
	 * Represents the state where a task is in the Rejected State.
	 * @author wbooth
	 *
	 */
	private class RejectedState {
		
	}
}
