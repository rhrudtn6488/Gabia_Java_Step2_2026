package chapter08;

public class Student extends People {
	public int studentNo;

	public Student(String name, String phone, int studentNo) {
		// super(); //People() x
		super(name, phone); // People(String name, String ssn)
		this.studentNo = studentNo;
	}

}
