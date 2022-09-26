package Student_Console;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import com.

public class Test {
	static Process_student ps  = new Process_student();
	Scanner s = new Scanner(System.in); 
	
	public static void main(String[] args) {
		insertStudent("a1", "john", "male", "abc555", "5 alpha street, mars", 100.0);
		insertStudent("b2", "max", "male", "abc555", "5 alpha street, mars", 100.0);
		insertStudent("a2", "sam", "female", "abc555", "5 alpha street, mars", 100.0);
		updateStudent("a2", "rose", "female", "abc555", "5 alpha street, mars", 100.0);
		displayStudent("abc555");
		delStudent("a1");

	}
	
	public static void delStudent(String id) {
		ps.delStudent(id);
	}
	
	public static void displayStudent(String classId) {
		ArrayList<Student> studentList = ps.getStudent_byClass(classId);
	}
	
	public static void insertStudent(String id, String name, String gender, String classId, String address, Double mark) {
		ps.insertStudent(id, name, gender, classId, address, mark);
	}
	
	public static void updateStudent(String id, String name, String gender, String classId, String address, Double mark) {
		ps.updateStudent(id, name, gender, classId, address, mark);
	}
}
