package Demo_Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		StudentDAOImpl studentDAO = new StudentDAOImpl();
		
		boolean clock = true;
		
		while(clock) {
			
			menu();
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					System.out.println("Enter First name : ");
					String fname = sc.next();

					System.out.println("Enter Last name : ");
					String lname = sc.next();

					System.out.println("Enter your Email : ");
					String email = sc.next();

					Student tempStudent = new Student(fname , lname , email);
					
					studentDAO.save(tempStudent);
					System.out.println("Saved succesfully , id number is :"+tempStudent.getId());
					System.out.println();
					break;
					
				case 2 :
					System.out.println("Enter id for student details " );
					int id = sc.nextInt();
					Student s  = studentDAO.findById(id);
					System.out.println(s);
					System.out.println();
					break;
					
				case 3 :
					System.out.println("Enter id number for update student details : ");
					int idu = sc.nextInt();
					studentDAO.updateById(idu);
					System.out.println();
					break;
				
				case 4 :
					System.out.println("Enter id for deletion of student details : ");
					int idd = sc.nextInt();
					studentDAO.delete(idd);
					System.out.println();
					break;
					
				case 5 :
					studentDAO.printAll();
					System.out.println();
					break;
					
				case 6 :
					clock = false;
					break;
				
				default:
					System.out.println("Enter correct choice please....! ");
					
			}
		
		}
		sc.close();
	}
	
	public static  void menu()
	{
		System.out.println("1 . Create new Student ");
		System.out.println("2 . Get info from student list by id");
		System.out.println("3 . Update Student list by id");
		System.out.println("4 . Delete Student from list by id");
		System.out.println("5 . Show All Student Details");
		System.out.println("6 . Exit");
	}
}

