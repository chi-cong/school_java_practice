package copyBaiNay;

public class Product {
	String ID;
	String name;
	public Product() {
		
	}
	
	public Product(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
