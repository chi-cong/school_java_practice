package Student_Console;

import java.sql.Connection;
import java.util.ArrayList;

public class Process_student implements IStudent {

	@Override
	public boolean delStudent(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getCon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getListStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getStudent_byClass(String ClassID, boolean gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getStudent_byClass_gender(String ClassID, boolean gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent_byId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertStudent(String id, String name, String gender, String classId, String address, Double mark) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(String id, String name, String gender, String classId, String address, Double mark) {
		// TODO Auto-generated method stub
		return false;
	}

}
