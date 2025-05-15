package microsoft.spring;

public class Student {
	private int roll;
	private String name;
	private String std;
	private String city;
	private float perc;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getPerc() {
		return perc;
	}

	public void setPerc(float perc) {
		this.perc = perc;
	}

	public void demo() {
		System.out.println("Value of roll : "+roll);
		System.out.println("Value of name : "+name);
		System.out.println("Value of std : "+std);
		System.out.println("Value of city : "+city);
		System.out.println("Value of perc : "+perc);
	}
}
