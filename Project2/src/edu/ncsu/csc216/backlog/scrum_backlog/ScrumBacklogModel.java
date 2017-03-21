package edu.ncsu.csc216.backlog.scrum_backlog;

import edu.ncsu.csc216.backlog.command.Command;
import edu.ncsu.csc216.backlog.task.TaskItem;
import edu.ncsu.csc216.backlog.task.TaskItem.Type;

//TODO add descriptions to Javadoc
/**
 * Add descriptions.
 * @author Walker Booth
 * @author Brian Morris
 *
 */
public class ScrumBacklogModel {

    /**
     * The constructor of ScrumBacklogModel
     */
    private ScrumBacklogModel() {
        
    }
    
    /**
     * Returns the instance of ScrumBacklogModel.
     * @return the instance of ScrumBacklogModel
     */
    public static ScrumBacklogModel getInstance() {
        return null;
    }
    
    /**
     * Saves a TaskItemList to a file with the specified file name.
     * @param filename the name of the file
     */
    public void saveTasksToFile(String filename) {
        
    }
    /**
     * Loads a TaskItemList from a file with the specified file name.
     * @param filename the name of the file
     */
    public void loadTasksFromFile(String filename) {
        
    }
    /**
     * Creates a new TaskItemList.
     */
    public void createNewTaskItemList() {
        
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems in the
     * backlog.
     * @return the TaskItems in the backlog
     */
    public Object[][] getTaskItemListAsArray() {
        return null;
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems that have
     * the specified owner.
     * @param owner the creator of the TaskItems
     * @return the TaskItems with the specified owner
     */
    public Object[][] getTaskItemListByOwnerAsArray(String owner) {
        return null;
    }
    
    /**
     * Returns a 2D array of objects containing the TaskItems that have
     * the specified creator.
     * @param creator the creator of the TaskItems
     * @return the TaskItems with the specified creator
     */
    public Object[][] getTaskItemListByCreatorAsArray(String creator) {
        return null;
    }
    
    /**
     * Returns the TaskItem with associated id.
     * @param id the id of the TaskItem
     * @return the TaskItem with the associated id
     */
    public TaskItem getTaskItemById(int id) {
        return null;
    }

    /**
     * Executes the specified command on the TaskItem with the specified id.
     * @param id the id of the TaskItem
     * @param command the command to execute
     */
    public void executeCommand(int id, Command command) {
        
    }

    /**
     * Deletes a TaskItem from the list with the specified id.
     * @param id the id of the TaskItem
     */
    public void deleteTaskItemById(int id) {
        
    }

    /**
     * Adds a new TaskItem to the list of TaskItems.
     * @param title the title of the TaskItem
     * @param type the type of the TaskItem
     * @param creator the creator of the TaskItem
     * @param note the note of the TaskItem
     */
    public void addTaskItemToList(String title, Type type, String creator, String note) {
        
    }
}
