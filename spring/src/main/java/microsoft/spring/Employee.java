package microsoft.spring;

public class Employee {
	private int id;
	private String name;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void demo() {
		System.out.println("Value of id : "+id);
		System.out.println("Value of name : "+name);
		System.out.println("Value of dept : "+dept);
	}

}
