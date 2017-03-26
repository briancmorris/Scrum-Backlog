package edu.ncsu.csc216.backlog.task;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.backlog.task.TaskItem.Type;
import edu.ncsu.csc216.task.xml.NoteList;
import edu.ncsu.csc216.task.xml.Task;

/**
 * Tests the TaskItem class
 * @author Brian Morris
 *
 */
public class TaskItemTest {

	/** An example of a valid task title */ 
	private static final String VALID_TITLE = "Bug Fix";
	/** An example of a valid task type */
	private static final Type VALID_TYPE = Type.BUG;
	/** An example of a valid creator of a task */
	private static final String VALID_CREATOR = "wgbooth";
	/** An example of a valid note for a task */
	private static final String VALID_NOTE = "You've got a bug!";
	
	/**
	 * Tests the full constructor for a TaskItem.
	 */
    @Test
    public void testTaskItemFourParams() {
    	try {
        	TaskItem t = new TaskItem (null, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem ("", VALID_TYPE, VALID_CREATOR, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, null, VALID_CREATOR, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, null, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, "", VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, null);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, "");
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Paramaters cannot be null or empty.", e.getMessage());
    	}
    	
    	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	assertEquals(VALID_TITLE, t.getTitle());
    	assertEquals(VALID_TYPE, t.getType());
    	assertEquals(VALID_CREATOR, t.getCreator());
    	assertEquals(VALID_NOTE, t.getNotes().get(0));
    }
    
    /**
     * Tests the constructor that takes a parameter of type Task
     */
    public void testTaskItemOneParam () {
    	Task task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	task.setCreator(VALID_CREATOR);
    	TaskItem t = new TaskItem(task);
    	assertEquals(VALID_TITLE, t.getTitle());
    	assertEquals(VALID_TYPE, t.getType());
    	assertEquals(VALID_CREATOR, t.getCreator());
    }

}
