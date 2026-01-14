package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {
		//Employee 객체 생성후 메서드 사용
		Employee emp = new Employee("김직원", 4000);
		emp.work();
		emp.getInfo();
		
		System.out.println();
		// Manger 객체 생성후 메서드 사용
		Manager mgr = new Manager("박관리자", 5000, "영업");
		mgr.work();
		mgr.getInfo();
		mgr.approveLeave("김직원");
		
		System.out.println();
		//상속 개념이 보이게 객체 생성후 메서드 사용(Employee와 Manager 교집합 기능만
		Employee emp2 = new Manager("최팀장", 5500, "개발");
		emp2.work();
		emp2.getInfo();
		//emp2.approveLeave(); //컴파일 에러(객체의 주체 Employee 타입으로 간주 Manager)
	
	}

}
