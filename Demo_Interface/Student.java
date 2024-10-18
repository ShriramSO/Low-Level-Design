package Demo_Interface;

public class Student {
	
	static int id=0;
	int student_id;
	String first_name;
	String last_name;
	String email;
	
	public Student(String first_name, String last_name, String email) {
		id++;
		student_id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	
	
	public int getId() {
		return student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Id = "+getId()+" Student [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	
	
}
