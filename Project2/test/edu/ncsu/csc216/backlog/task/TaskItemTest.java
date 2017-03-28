package edu.ncsu.csc216.backlog.task;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.backlog.task.TaskItem.Type;
import edu.ncsu.csc216.task.xml.NoteItem;
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
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem ("", VALID_TYPE, VALID_CREATOR, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, null, VALID_CREATOR, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, null, VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, "", VALID_NOTE);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, null);
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	try {
        	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, "");
        	fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	TaskItem t = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	assertEquals(VALID_TITLE, t.getTitle());
    	assertEquals(VALID_TYPE, t.getType());
    	assertEquals(VALID_CREATOR, t.getCreator());
    	assertEquals(VALID_CREATOR, t.getNotes().get(0));
    	assertEquals(VALID_NOTE, t.getNotes().get(1));
    	assertEquals(1, t.getTaskItemId());
    	assertEquals("BACKLOG", t.getStateName());
    	assertEquals(null, t.getOwner());

    }
    
    /**
     * Tests the constructor that takes a parameter of type Task
     */
    @SuppressWarnings("unused")
	public void testTaskItemOneParam () {
    	Task task = new Task();
    	task.setTitle(null);
    	task.setType("BUG");
    	NoteItem noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText(VALID_NOTE);
    	NoteList noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle("");
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText(VALID_NOTE);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType(null);
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText(VALID_NOTE);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText(VALID_NOTE);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(null);
    	noteItem.setNoteText(VALID_NOTE);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor("");
    	noteItem.setNoteText(VALID_NOTE);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText(null);
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor(VALID_CREATOR);
    	noteItem.setNoteText("");
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	try {
    		TaskItem t = new TaskItem(task);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task information.", e.getMessage());
    	}
    	
    	task = new Task();
    	task.setTitle(VALID_TITLE);
    	task.setType("BUG");
    	noteItem = new NoteItem();
    	noteItem.setNoteAuthor("wgbooth");
    	noteItem.setNoteText("This is a note.");
    	noteList = new NoteList();
		noteList.getNotes().add(noteItem);
		task.setNoteList(noteList);
    	TaskItem t = new TaskItem(task);
    	assertEquals(VALID_TITLE, t.getTitle());
    	assertEquals(VALID_TYPE, t.getType());
    	assertEquals(VALID_CREATOR, t.getCreator());
    	assertEquals(VALID_CREATOR, t.getNotes().get(0));
    	assertEquals(VALID_NOTE, t.getNotes().get(1));
    	assertEquals("BACKLOG", t.getStateName());
    	assertEquals(1, t.getTaskItemId());
    	assertEquals(null, t.getOwner());
    	
    }
    
    /**
     * Tests the incrementCounter method.
     */
	@Test
    public void testIncrementCounter() {
    	TaskItem t1 = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	assertEquals(1, t1.getTaskItemId());
    	TaskItem t2 = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	assertEquals(2, t2.getTaskItemId());

    }
    
    /**
     * Tests the setState method
     */
    @Test
    public void testSetState() {
    	TaskItem t1 = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	try {
    		t1.setState(null);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid state.", e.getMessage());
    	}
    	
    	try {
    		t1.setState("BACKLOG");
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid state.", e.getMessage());
    	}
    	
    	t1.setState("Backlog");
    	assertEquals("Backlog", t1.getStateName());
    }
    
    /**
     * Tests the setType method
     */
    @Test
    public void testSetType() {
    	TaskItem t1 = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	try {
    		t1.setType(null);
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid type.", e.getMessage());
    	}
    	
    	try {
    		t1.setType("BACKLOG");
    		fail();
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid type.", e.getMessage());
    	}
    	
    	t1.setType("F");
    	assertEquals("F", t1.getStateName());
    }
    
    /**
     * Tests the setCounter method.
     */
    @Test
    public void testSetCounter() {
    	try {
    		TaskItem.setCounter(-1);
    	} catch (IllegalArgumentException e) {
    		assertEquals("Invalid task item id.", e.getMessage());
    	}
    	
    	TaskItem.setCounter(9);
    	TaskItem t1 = new TaskItem (VALID_TITLE, VALID_TYPE, VALID_CREATOR, VALID_NOTE);
    	assertEquals(10, t1.getTaskItemId());
    }
    
}
