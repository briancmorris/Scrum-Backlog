/**
 * 
 */
package edu.ncsu.csc216.backlog.task;

/**
 * Contains data about a Note in the Scrum system. 
 * @author Walker Booth
 * @author Brian Morris
 */
public class Note {

    /** The author of the Note */
    private String noteAuthor;
    /** The text of the Note */
    private String noteText;
    
    /**
     * The constructor of Note.
     * @param noteAuthor the author of the Note
     * @param noteText the text of the Note
     */
    public Note (String noteAuthor, String noteText) {
        if (noteAuthor == null || noteAuthor.isEmpty()) {
        	throw new IllegalArgumentException("Parameters cannot be null or empty.");
        }
        
        if (noteText == null || noteText.isEmpty()) {
        	throw new IllegalArgumentException("Parameters cannot be null or empty.");
        }
    	
    	this.noteAuthor = noteAuthor;
        this.noteText = noteText;
    }
    
    /**
     * Returns the author of the Note.
     * @return the author of the Note
     */
    public String getNoteAuthor() {
        return noteAuthor;
    }
    
    /**
     * Returns the noteText of the Note.
     * @return the noteText of the Note
     */
    public String getNoteText() {
        return noteText;
    }
    
    /**
     * Returns a String array of size 2 with noteAuthor as the first element, noteText as the second. 
     * @return s the String array
     */
    public String[] getNoteArray() {
        String[] s = new String[2];
        s[0] = noteAuthor;
        s[1] = noteText;
        return s;
    }
}
