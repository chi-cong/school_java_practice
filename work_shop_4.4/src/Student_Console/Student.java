package Student_Console;

public class Student {
	private String id;
	private String name;
	private String classID;
	private String gender;
	private String address;
	private Double mark;
	
//	constructors
	public Student () {
		super();
	}
	public Student (
		String id,
		String name,
		String classID,
		String gender,
		String address,
		Double mark
	) {
		super();
		this.id = id;
		this.name = name;
		this.classID = classID;
		this.gender = gender;
		this.address = address;
		this.mark = mark;
	}
	
//	getters/setter 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
}
