package diubaldo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;

@Entity
public class Todo {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String task;
	private LocalDate dueDate;
	private LocalDate creationDate;
	private LocalDate completedDate;
	private boolean isCompleted;
	
	
	@PrePersist
	public void Init() {
		setCreationDate(LocalDate.now());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(LocalDate completedDate) {
		this.completedDate = completedDate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
}
