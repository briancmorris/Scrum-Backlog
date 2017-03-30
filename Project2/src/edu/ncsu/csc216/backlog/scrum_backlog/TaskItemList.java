package edu.ncsu.csc216.backlog.scrum_backlog;

import java.util.ArrayList;
import java.util.List;

import edu.ncsu.csc216.backlog.command.Command;
import edu.ncsu.csc216.backlog.task.TaskItem;
import edu.ncsu.csc216.backlog.task.TaskItem.Type;
import edu.ncsu.csc216.task.xml.Task;

//TODO update all Javadoc to be descriptive.
/**
 * Add descriptions.
 * @author Brian Morris
 * @author Walker Booth
 */
public class TaskItemList {

    // TODO Add field descriptions
    /** The initial counter value to generate task ID numbers */
    private static final int INITIAL_COUNTER_VALUE = 1;
    /** An ArrayList used to store TaskItems */
    private ArrayList<TaskItem> taskItemList;

    /**
     * The constructor for TaskItemList constructs an empty ArrayList of TaskItems.
     */
    public TaskItemList() {
        emptyList();
    }

    /**
     * Creates an empty TaskItemList.
     */
    private void emptyList() {
        this.taskItemList = new ArrayList<TaskItem>();
        TaskItem.setCounter(INITIAL_COUNTER_VALUE);
    }

    /**
     * Adds a TaskItem to the end of the TaskItemList.
     * @param title the title of the TaskItem
     * @param type the type of the TaskItem
     * @param creator the creator of the TaskItem
     * @param note the note of the TaskItem
     * @return the 
     */
    public int addTaskItem(String title, Type type, String creator, String note) {
        TaskItem newTask = new TaskItem(title, type, creator, note);
        taskItemList.add(newTask);
        return newTask.getTaskItemId();
    }

    /**
     * Adds TaskItems found from an XML file to the list.
     * @param list an ArrayList containing TaskItem values.
     */
    public void addXMLTasks(List<Task> list) {
        //maxID, maxID+1 when incrementing counter
    }

    /**
     * Returns the ArrayList containing the TaskItems.
     * @return the ArrayList containing the TaskItems
     */
    public List<TaskItem> getTaskItems() {
        return taskItemList;
    }

    /**
     * Returns a list containing the TaskItems sorted by a specified owner.
     * @param owner the owner of the TaskItems
     * @return a list containing the TaskItems sorted by the specified owner
     */
    public List<TaskItem> getTaskItemsByOwner(String owner) {
        return null;
    }

    /**
     * Returns a list containing the TaskItems sorted by a specified creator.
     * @param creator the creator of the TaskItems
     * @return a list containing the TaskItems sorted by the specified creator
     */
    public List<TaskItem> getTasksByCreator(String creator) {
        return null;
    }

    /**
     * Gets the specified TaskItem based on its id.
     * @param id the id of the TaskItem
     * @return the TaskItem with the specified id
     */
    public TaskItem getTaskItemById(int id) {
        return null;
    }
    
    /**
     * Executes the specified command on the TaskItem with the specified id
     * @param id the id of the TaskItem
     * @param command the command to perform
     */
    public void executeCommand(int id, Command command) {
        
    }
    
    /**
     * Deletes the TaskItem with the specified id from the list.
     * @param id the id of the TaskItem
     */
    public void deleteTaskItemById(int id) {
        
    }
}
