package tasktracker;


import java.time.LocalDateTime;
/**
 * The tracker that have the list of all task
 * 
 * @author pokem
 */

public class Task {
	
	private int id;
	private String description;
	private int status;
	
	private LocalDateTime creationDate;
	private LocalDateTime updatedAt;
	
	
	public Task() {
		
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	/**
	 * converting the numerical number of status to a state 
	 * @param status
	 * @return 
	 */
	public String getStatusString(int status) {
		switch (status) {
		case 1:
			return "Not Done";
		case 2:
			return "On going";
		case 3: 
			return "Done";
		}
		return null;
	}
	
	@Override
		public String toString() {
			String text = (id +": "+ description+ ": " + getStatusString(status) + " Created: " + creationDate + " Last Updated: "+ updatedAt);
			return text;
		}
}
