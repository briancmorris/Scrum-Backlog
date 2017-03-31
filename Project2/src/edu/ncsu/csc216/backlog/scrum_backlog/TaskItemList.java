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
     * Creates an empty TaskItemList and ensures that the counter in TaskItem is 1.
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
     * Adds tasks found in the given task list to the TaskItemList.
     * @param list a list containing TaskItem values.
     */
    public void addXMLTasks(List<Task> list) {
        int maxID = list.get(0).getId();
        for (int i = 0; i < list.size(); i++) {
            TaskItem newTask = new TaskItem(list.get(i));
            taskItemList.add(newTask);
            if (list.get(i).getId() > maxID) {
                maxID = list.get(i).getId();
            }
        }
        TaskItem.setCounter(maxID + 1);
    }

    /**
     * Returns the list containing the TaskItems.
     * @return the list containing the TaskItems
     */
    public List<TaskItem> getTaskItems() {
        return taskItemList;
    }

    /**
     * Returns a list containing the TaskItems sorted by the specified owner.
     * @param owner the owner of the TaskItems
     * @return a list containing the TaskItems sorted by the specified owner
     */
    public List<TaskItem> getTaskItemsByOwner(String owner) {
        if (owner == null) {
        	throw new IllegalArgumentException ();
        }
    	
    	List<TaskItem> sortedByOwner = new ArrayList<TaskItem>();
        for (int i = 0; i < taskItemList.size(); i++) {
            TaskItem testItem = taskItemList.get(i);
            if (testItem.getOwner() != null && testItem.getOwner().equals(owner)) {
                sortedByOwner.add(testItem);
            }
        }
        return sortedByOwner;
    }

    /**
     * Returns a list containing the TaskItems sorted by the specified creator.
     * @param creator the creator of the TaskItems
     * @return a list containing the TaskItems sorted by the specified creator
     */
    public List<TaskItem> getTasksByCreator(String creator) {
        if (creator == null) {
        	throw new IllegalArgumentException();
        }
    	
    	List<TaskItem> sortedByCreator = new ArrayList<TaskItem>();
        for (int i = 0; i < taskItemList.size(); i++) {
            TaskItem testItem = taskItemList.get(i);
            if (testItem.getCreator() != null && testItem.getCreator().equals(creator)) {
                sortedByCreator.add(testItem);
            }
        }
        return sortedByCreator;
    }

    /**
     * Returns the TaskItem that has the specified id.
     * @param id the id of the TaskItem
     * @return the TaskItem with the specified id
     */
    public TaskItem getTaskItemById(int id) {
        for (int i = 0; i < taskItemList.size(); i++) {
            TaskItem testItem = taskItemList.get(i);
            if (testItem.getTaskItemId() == id) {
                return testItem;
            }
        }
        return null;
    }

    /**
     * Deletes the TaskItem that has the specified id from the list.
     * @param id the specified id of the TaskItem
     */
    public void deleteTaskItemById(int id) {
        for (int i = 0; i < taskItemList.size(); i++) {
            TaskItem testItem = taskItemList.get(i);
            if (testItem.getTaskItemId() == id) {
                taskItemList.remove(i);
            }
        }
    }

    /**
     * Executes the specified command on the TaskItem that has the specified id
     * @param id the id of the TaskItem
     * @param command the command to perform
     */
    public void executeCommand(int id, Command command) {
        for (int i = 0; i < taskItemList.size(); i++) {
            TaskItem testItem = taskItemList.get(i);
            if (testItem.getTaskItemId() == id) {
                testItem.update(command);
            }
        }
    }
}
