package edu.ncsu.csc216.backlog.scrum_backlog;

import java.util.ArrayList;

import edu.ncsu.csc216.backlog.command.Command;
import edu.ncsu.csc216.backlog.task.TaskItem;
import edu.ncsu.csc216.backlog.task.TaskItem.Type;
import edu.ncsu.csc216.task.xml.TaskIOException;
import edu.ncsu.csc216.task.xml.TaskReader;
import edu.ncsu.csc216.task.xml.TaskWriter;

//TODO add descriptions to Javadoc
/**
 * Add descriptions.
 * @author Walker Booth
 * @author Brian Morris
 *
 */
public class ScrumBacklogModel {

	/** The single instance of the ScrumBacklogModel */
	private static ScrumBacklogModel singleton;
	/** The list of Task Items */
	private TaskItemList tasks;
	
    /**
     * The constructor of ScrumBacklogModel
     */
    private ScrumBacklogModel() {
        tasks = new TaskItemList();
    }
    
    /**
     * Returns the instance of ScrumBacklogModel.
     * @return the instance of ScrumBacklogModel
     */
    public static ScrumBacklogModel getInstance() {
    	if (singleton == null) {
    		singleton = new ScrumBacklogModel();
    		
    	} 
    	return singleton;
    }
    
    /**
     * Saves a TaskItemList to a file with the specified file name.
     * @param filename the name of the file
     */
    public void saveTasksToFile(String filename) {
    	if (tasks.getTaskItems().size() == 0) {
    		throw new IllegalArgumentException();
    	}
    	
    	if (filename == null) {
    		throw new IllegalArgumentException();
    	}
    	
    	try {
    		TaskWriter output = new TaskWriter(filename);
    		for (int i = 1; i <= tasks.getTaskItems().size(); i++) {  
    			//TaskItem t = getTaskItemById(i);
    			output.addItem(tasks.getTaskItemById(i).getXMLTask());
    		}
    		output.marshal();
    	} catch (TaskIOException e) {
    		throw new IllegalArgumentException();
    	}    	
    }
    
    /**
     * Loads a TaskItemList from a file with the specified file name.
     * @param filename the name of the file
     */
    public void loadTasksFromFile(String filename) {
    	try {
    		TaskReader input = new TaskReader(filename);
			tasks.addXMLTasks(input.getTasks());
			
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
    }
    
    /**
     * Creates a new TaskItemList.
     */
    public void createNewTaskItemList() {
        tasks = new TaskItemList();
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems in the
     * backlog.
     * @return the TaskItems in the backlog
     */
    public Object[][] getTaskItemListAsArray() {
		Object[][] array = new Object[tasks.getTaskItems().size()][3];
    	for (int i = 1; i <= tasks.getTaskItems().size(); i++) {
			if (!(tasks.getTaskItemById(i) == null)) {
				array[i - 1][0] = tasks.getTaskItemById(i).getTaskItemId();
				array[i - 1][1] = tasks.getTaskItemById(i).getStateName();
				array[i - 1][2] = tasks.getTaskItemById(i).getTitle();
			}
		}
    	return array;
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems that have
     * the specified owner.
     * @param owner the creator of the TaskItems
     * @return the TaskItems with the specified owner
     */
    public Object[][] getTaskItemListByOwnerAsArray(String owner) {
    	ArrayList<TaskItem> list = (ArrayList<TaskItem>) tasks.getTaskItemsByOwner(owner);
    	Object[][] o = new Object[list.size()][3];
    	for (int i = 0; i < list.size(); i++) {
    		o[i][0] = list.get(i).getTaskItemId();
    		o[i][1] = list.get(i).getStateName();
    		o[i][2] = list.get(i).getTitle();
    	}
    	return o;
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems that have
     * the specified creator.
     * @param creator the creator of the TaskItems
     * @return the TaskItems with the specified creator
     */
    public Object[][] getTaskItemListByCreatorAsArray(String creator) {
    	ArrayList<TaskItem> list = (ArrayList<TaskItem>) tasks.getTasksByCreator(creator);
    	Object[][] o = new Object[list.size()][3];
    	for (int i = 0; i < list.size(); i++) {
    		o[i][0] = list.get(i).getTaskItemId();
    		o[i][1] = list.get(i).getStateName();
    		o[i][2] = list.get(i).getTitle();
    	}
    	return o;
    }
    
    /**
     * Returns the TaskItem with associated id.
     * @param id the id of the TaskItem
     * @return the TaskItem with the associated id
     */
    public TaskItem getTaskItemById(int id) {
        return tasks.getTaskItemById(id);
    }

    /**
     * Executes the specified command on the TaskItem with the specified id.
     * @param id the id of the TaskItem
     * @param command the command to execute
     */
    public void executeCommand(int id, Command command) {
       getTaskItemById(id).update(command);
    }

    /**
     * Deletes a TaskItem from the list with the specified id.
     * @param id the id of the TaskItem
     */
    public void deleteTaskItemById(int id) {
        tasks.deleteTaskItemById(id);
    }

    /**
     * Adds a new TaskItem to the list of TaskItems.
     * @param title the title of the TaskItem
     * @param type the type of the TaskItem
     * @param creator the creator of the TaskItem
     * @param note the note of the TaskItem
     */
    public void addTaskItemToList(String title, Type type, String creator, String note) {
        TaskItem.setCounter(tasks.addTaskItem(title, type, creator, note) + 1);
    }
}
