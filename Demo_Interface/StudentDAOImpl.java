package Demo_Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAOImpl{
	
	ArrayList<Student> list;
	
	StudentDAOImpl()
	{
		list = new ArrayList<>();
	}
	
	Scanner sc = new Scanner(System.in);

	
	public void save(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
	}


	public Student findById(int id) {
		// TODO Auto-generated method stub
		for(Student s : list)
		{
			if(s.getId() == id)
			{
				return s;
			}
		}
		return null;
	}


	public void updateById(int id) {
		// TODO Auto-generated method stub
		for(Student s : list)
		{
			if(s.getId() == id)
			{
				System.out.println("Enter first name : ");
				String fname = sc.next();
				s.setFirst_name(fname);
				
				System.out.println("Enter last name : ");
				String lname = sc.next();
				s.setLast_name(lname);
				
				System.out.println("Enter email : ");
				String email = sc.next();
				s.setEmail(email);
			}
		}
	}
	

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		for(Student s : list)
		{
			if(s.getId() == id)
			{
				list.remove(s);
				System.out.println("Student with ID " + id + " has been deleted.");
				break;
			}
		}
		
	}
	
	public void printAll()
	{
		for(Student s : list)
		{
			System.out.println(s);
		}
	}
	
}
