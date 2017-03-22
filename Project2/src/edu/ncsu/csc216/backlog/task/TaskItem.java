/**
 * 
 */
package edu.ncsu.csc216.backlog.task;

import java.util.ArrayList;

import edu.ncsu.csc216.backlog.command.Command;
import edu.ncsu.csc216.task.xml.Task;

/**
 * Holds data about TaskItem objects. 
 * @author Walker Booth
 */
public class TaskItem {

	/** ID of the task */
	private int taskID;
	
	/** State of the task */
	private TaskItemState state;
	
	/** Title of the task */
	private String title;
	
	/** Creator of the task */
	private String creator;
	
	/** Owner of the task */
	private String owner;
	
	/** Whether or note the task is verified */
	private boolean isVerified;
	
	/** The state of backlog for a task */
	private final TaskItemState backlogState = new BacklogState();
	
	/** The state of owned for a task */
	private final TaskItemState ownedState = new OwnedState();
	
	/** The state of processing for a task */
	private final TaskItemState processingState = new ProcessingState();
	
	/** The state of verifying for a task */
	private final TaskItemState verifyingState = new VerifyingState();
	
	/** The state of done for a task */
	private final TaskItemState doneState = new DoneState();
	
	/** The state of rejected for a task */
	private final TaskItemState rejectedState = new RejectedState();
	
	/** The string representation of backlog */
	public static final String BACKLOG_NAME = "Backlog";
	
	/** the string representation of owned */
	public static final String OWNED_NAME = "Owned";
	
	/** The string representation of processing */
	public static final String PROCESSING_NAME = "Processing";
	
	/** The string representation of verifying */
	public static final String VERIFYING_NAME = "Veryifying";
	
	/** The string representation of done */
	public static final String DONE_NAME = "Done";
	
	/** The string representation of rejected */
	public static final String REJECTED_NAME = "Rejected";
	
	/** The string representation of the feature type */
	private static final String T_FEATURE = "F";
	
	/** The string representation of the bug type */
	private static final String T_BUG = "B";
	
	/** The string representation of the technical work type */
	private static final String T_TECHNICAL_WORK = "TW";
	
	/** The string representation of the knowledge acquisition type */
	private static final String T_KNOWLEDGE_ACQUISITION = "KA";
	
	/** A counter variable */
	private static int counter = 1;
	
	/**
	 * Constructor for TaskItem
	 * @param title the title of the task  
	 * @param type the type of the task
	 * @param creator the creator of the task
	 * @param note the note attached to the task
	 */
	public TaskItem(String title, Type type, String creator, String note) {
		
	}
	
	/**
	 * Alternate constructor for TaskItem
	 * @param task the type of the task
	 */
	public TaskItem(Task task) {
		
	}
	
	/**
	 * Increments the counter variable
	 */
	public static void incrementCounter() {
		counter++;
	}
	
	/**
	 * Returns the current state of the task item
	 * @return the state
	 */
	public TaskItemState getState() {
		return state;
	}

	/**
	 * Sets the state of the task 
	 * @param state the state to set
	 */
	protected void setState(String state) {

	}
	
	/**
	 * Sets the type of the task 
	 * @param type the type to set
	 */
	protected void setType(String type) {
		
	}

	/**
	 * Gets the task item's ID
	 * @return the taskID
	 */
	public int getTaskItemId() {
		return taskID;
	}

	/**
	 * Gets the title of the task
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Gets the creator of the task 
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Gets the owner of the task 
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * Sets the counter variable 
	 * @param counter the counter to set
	 */
	public static void setCounter(int counter) {
		TaskItem.counter = counter;
	}
	
	/**
	 * Returns the name of the task's state
	 * @return the name of the task's state
	 */
	public String getStateName() {
		return null;
	}
	
	/** 
	 * Returns the type of the task
	 * @return the type of the task
	 */
	public Type getType() {
		return null;
	}
	
	/**
	 * Returns the type of the task as a string
	 * @return the type of the task as a string
	 */
	public String getTypeString() {
		return null;
	}
	
	/**
	 * Returns the type of the task as a full string
	 * @return the type of the task as a full string
	 */
	public String getTypeFullString() {
		return null;
	}

	
	/** 
	 * Returns the notes of the task 
	 * @return the notes of the task
	 */
	public ArrayList<Note> getNotes() {
		return null;
	}
	
	/**
	 * Updates the current command for the task
	 * @param command the command to execute
	 */
	public void update (Command command) {
		
	}
	
	/**
	 * Returns the task as an XML type
	 * @return the task an an XML type
	 */
	public Task getXMLTask() {
		return null;
	}
	
	/**
	 * Returns the list of notes as a 2D String array
	 * @return the list of notes
	 */
	public String[][] getNotesArray () {
		return null;
	}

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
	 * @author Walker Booth
	 *
	 */
	private class BacklogState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Represents the state where a task is in the Owned State.
	 * @author Walker Booth
	 *
	 */
	private class OwnedState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Represents the state where a task is in the Processing State.
	 * @author Walker Booth
	 *
	 */
	private class ProcessingState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Represents the state where a task is in the Verifying State.
	 * @author Walker Booth
	 *
	 */
	private class VerifyingState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Represents the state where a task is in the Done State.
	 * @author Walker Booth
	 *
	 */
	private class DoneState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Represents the state where a task is in the Rejected State.
	 * @author Walker Booth
	 *
	 */
	private class RejectedState implements TaskItemState {

		@Override
		public void updateState(Command c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getStateName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/**
	 * Holds the various types of types
	 * @author Walker Booth
	 *
	 */
	public static enum Type { FEATURE, BUG, TECHNICAL_WORK, KNOWLEDGE_ACQUISITION }	

}
