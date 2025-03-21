/*Q2. Student Marks and Average 
Create a class Student with the following members: 
  Name of the student 
  Marks in three subjects 
  A method to assign initial values 
  A method to compute the total and average marks 
  A method to display the student’s name and total marks */

class Student{
	String name;
	int m1;
	int m2;
	int m3;
	
	Student(String name,int m1,int m2, int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int totalmarks() {
		return m1+m2+m3;
	}
	public int averageMarks() {
        return totalmarks() / 3;
    }
	public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalmarks());      
    }
}
public class Details {
	public static void main(String[] args) {		
		Student s = new Student("mansi",90,80,90);
		s.displayStudentDetails();
		System.out.println(s.averageMarks());
	}

}