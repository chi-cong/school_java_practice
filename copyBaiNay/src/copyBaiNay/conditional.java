package copyBaiNay;

public class conditional extends Product {
	String company;
	int year;
	double price;
	
	public conditional(){
		super();
	}
	
	public conditional(String ID, String name, String company, int year, double price) {
		super(ID, name);
		this.company = company;
		this.year = year;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
