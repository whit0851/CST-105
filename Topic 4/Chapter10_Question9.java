import java.util.*;
public class Chapter10_Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Course Course1 = new Course();
		System.out.print("Enter the course name: ");
		String bill = input.nextLine(); 
		Course1.setCourse(bill);
		System.out.print("Enter the number of Students that you would like to add: ");
		int x = input.nextInt();
		input.nextLine();
		System.out.print("Enter the names of the students: ");
		for (int i = 0 ; i < x ; i++){
			String Names = input.nextLine();
			Course1.addStudent(Names);
		}
		System.out.print("\nThe names of the students in this class are: " + Course1.getStudents());
		System.out.print("\nEnter the name of the student you would like to drop: ");
		String Name =input.nextLine(); 
		Course1.dropStudent(Name);
		System.out.print("\nThe names of the students in the class now are: " +Course1.getStudents());
		System.out.print("\nThe number of students in the class are: " + Course1.getNumberOfStudents());
	}

}
class Course{
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>(3);
	private int numberOfStudents;
	
	Course(){
		numberOfStudents= 0;
	}
	public void setCourse(String courseName) {
		this.courseName = courseName;
	 }
	
	 public void addStudent(String student) {
		 students.add(student);
		 numberOfStudents++;
	 }
	
	 public ArrayList<String> getStudents() {
		 return students;
	 }
	
	 public int getNumberOfStudents() {
		 return numberOfStudents;
	 }
	
	 public String getCourseName() {
		 return courseName;
	 }
	
	 public void dropStudent(String student) {
	 students.remove(student);
	 numberOfStudents--;
	 }
	 public void clear(){
		 students.clear();
	 }

}