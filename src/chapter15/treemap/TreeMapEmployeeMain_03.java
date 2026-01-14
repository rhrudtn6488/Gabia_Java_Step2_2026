package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {

	public static void main(String[] args) {

		// TreeMap 객체(employeeMap) 사원번호를 입력하면 사원의 이름과 나이가 출력
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
		
		// 직원은 id를 키로, employeeMap에 Employee 객체 4명 추가
		employeeMap.put(102,new Employee("Alice", 30));
		employeeMap.put(103,new Employee("BOb", 25));
		employeeMap.put(104,new Employee("Charlie", 35));
		employeeMap.put(105,new Employee("David", 28));
		
		System.out.println("==학생 성적 출력(이름순 정렬)==");
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println();
		}
		
		//
		int employeeId = 103;
		System.out.println("\n"+employeeId+"의 성적: "+employeeMap.get(employeeId));
	}

}
