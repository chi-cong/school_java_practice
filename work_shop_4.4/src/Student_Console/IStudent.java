package Student_Console;

import java.util.ArrayList;
import java.sql.Connection;

public interface IStudent {
	boolean delStudent(String id);
	Connection getCon();
	ArrayList<Student> getListStudent();
	ArrayList<Student> getStudent_byClass(String ClassID);
	ArrayList<Student> getStudent_byClass_gender(String ClassID, String gender);
	Student getStudent_byId(String id);
	boolean insertStudent(String id, String name, String gender, String classId, String address, Double mark );
	boolean updateStudent(String id, String name, String gender, String classId, String address, Double mark );
}
