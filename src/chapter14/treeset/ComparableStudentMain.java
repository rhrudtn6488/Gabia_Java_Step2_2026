package chapter14.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudentMain {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();	
		
		
		employee.add(new Employee("고경수", 25));
		employee.add(new Employee("강상구", 23));
		employee.add(new Employee("이명현", 24));
		
		Collections.sort(employee, new NameComparator());
		
		System.out.println();
		for(Employee emp : employee) {
			System.out.println(emp);
		}
		System.out.println();
		
		Collections.sort(employee, new AgeComparator());
		for(Employee emp : employee) {
			System.out.println(emp);
		}
	}

}
