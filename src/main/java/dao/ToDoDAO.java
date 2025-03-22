package dao;

import java.util.List;

import beans.Register;
import beans.Task;

public interface ToDoDAO {
	public int register(Register reg);
	public int login(String email, String pass);
	public boolean addTask(Task task, int regid);
	public List<Task> findAllTasksByRegid(int regid);
	public boolean markTaskCompleted(int taskid, int regid);
	List<Task> findAllTasksByRegId(int regid);
}
