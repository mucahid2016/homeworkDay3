package homeworkDay3;

public class Instructor extends User {
	private String instructorName;

	public Instructor(int id, String firstName, String lastName, String email, String password, String instructorName) {
		super(id, firstName, lastName, email, password);
		this.instructorName = instructorName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	

}
