package Student_Console;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Process_student implements IStudent {

	public boolean delStudent(String id) {
		                 
		return false;
	}

	public Connection getCon() {
		String url = "jdbc:mysql://localhost:3306/db_student";
		String userName = "root";
		String password = "Dat422002";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, userName, password);
			return cn;
		} catch ( ClassNotFoundException | SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public ArrayList<Student> getListStudent() {
		Connection conn = getCon();
		String query = "Select * from tbStudent";
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getString("id"));
				student.setName("name");
				student.setClassID(resultSet.getString("idClass"));
				student.setGender(resultSet.getString("gender"));
				student.setAddress(resultSet.getString("address"));
				student.setMark(resultSet.getDouble("mark"));
				studentList.add(student);
				return studentList;
			}
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public ArrayList<Student> getStudent_byClass(String ClassID) {
		Connection conn = getCon();
		String query = "Select * from tbStudent where idClass = '" + ClassID +"'";
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getString("id"));
				student.setName("name");
				student.setClassID(resultSet.getString("idClass"));
				student.setGender(resultSet.getString("gender"));
				student.setAddress(resultSet.getString("address"));
				student.setMark(resultSet.getDouble("mark"));
				studentList.add(student);
				return studentList;
			}
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public ArrayList<Student> getStudent_byClass_gender(String ClassID, String gender) {
		
		Connection conn = getCon();
		String query = "Select * from tbStudent where idClass = '" + ClassID + "', gender = '" + gender + "'";
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getString("id"));
				student.setName("name");
				student.setClassID(resultSet.getString("idClass"));
				student.setGender(resultSet.getString("gender"));
				student.setAddress(resultSet.getString("address"));
				student.setMark(resultSet.getDouble("mark"));
				studentList.add(student);
				return studentList;
			}
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public Student getStudent_byId(String id) {
		
		Connection conn = getCon();
		String query = "Select * from tbStudent where id = '" + id + "'";
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getString("id"));
				student.setName("name");
				student.setClassID(resultSet.getString("idClass"));
				student.setGender(resultSet.getString("gender"));
				student.setAddress(resultSet.getString("address"));
				student.setMark(resultSet.getDouble("mark"));
				return student;
			}
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public boolean insertStudent(String id, String name, String gender, String classId, String address, Double mark) {
		
		Connection conn = getCon();
		String insertPrefix = "insert into tbStudent (id, name, gender, idClass, address, mark)";
		String insertedValue = "value ('" + id + "', '" + name + "', '" + gender + "', '" + classId + "', '" + address + "', " + mark;
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return false;
	}

	public boolean updateStudent(String id, String name, String gender, String classId, String address, Double mark) {
		
		return false;
	}
	
	

}
