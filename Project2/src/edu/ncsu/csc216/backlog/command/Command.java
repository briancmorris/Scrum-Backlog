/**
 * 
 */
package edu.ncsu.csc216.backlog.command;

/**
 * @author wbooth
 *
 */
public class Command {

	/** The details provided in a note */
	private String note;
	/** The author of the note */
	private String noteAuthor;
	
	/** Contains the types of state that a task can have */
	public static enum CommandValue { BACKLOG, CLAIM, PROCESS, VERIFY, COMPLETE, REJECT }
	
	/**
	 * The constructor for the command class
	 * @param c the current CommandValue for the given command
	 * @param noteAuthor the author of the note
	 * @param noteText the text of the note
	 */
	public Command(CommandValue c, String noteAuthor, String noteText) {
		
	}
	
	/**
	 * Returns the command value 
	 * @return commandValue the commandValue
	 */
	public CommandValue getCommand () {
		return null;
	}
	
	/**
	 * Returns the note String
	 * @return note the note string
	 */
	public String getNoteTest () {
		return note;
	}
	
	/**
	 * Returns the note author String
	 * @return noteAuthor the note author String
	 */
	public String getNoteAuthor () {
		return noteAuthor;
	}

}
