/**
 * 
 */
package edu.ncsu.csc216.backlog.command;

/**
 * Holds data for objects of type Command. 
 * @author Walker Booth
 */
public class Command {

	/** The details provided in a note */
	private String note;
	/** The author of the note */
	private String noteAuthor;
	/** The value of the command */
	private CommandValue c;
	
	/** Contains the types of state that a task can have */
	public static enum CommandValue { BACKLOG, CLAIM, PROCESS, VERIFY, COMPLETE, REJECT }
	
	/**
	 * The constructor for the command class
	 * @param c the current CommandValue for the given command
	 * @param noteAuthor the author of the note
	 * @param noteText the text of the note
	 */
	public Command(CommandValue c, String noteAuthor, String noteText) {
		if (c == null) {
			throw new IllegalArgumentException("Parameters must not be null or empty.");
		}
		
		if (noteAuthor == null || noteAuthor.isEmpty()) {
			throw new IllegalArgumentException("Parameters must not be null or empty.");
		}
		
		if (noteText == null || noteText.isEmpty()) {
			throw new IllegalArgumentException("Parameters must not be null or empty.");
		}
		
		this.c = c;
		this.noteAuthor = noteAuthor;
		this.note = noteText;
	}
	
	/**
	 * Returns the value of this command
	 * @return commandValue the value of this command
	 */
	public CommandValue getCommand () {
		return c;
	}
	
	/**
	 * Returns the note String
	 * @return note the note string
	 */
	public String getNoteText () {
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
