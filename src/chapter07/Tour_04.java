package chapter07;

import java.util.Scanner;

public class Tour_04 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = scan.nextInt();
		
		//초기화를 통해서 참조 메모리 확보(Guide의 객체 개수)
		//guide.guest[0];~guide.guest[4]
		Guide guide = new Guide(n);

		System.out.println();
		System.out.println("관광객 등록");
		//이름 성별
		for(int i=0; i<n; i++) {
			System.out.print("이름 입력 : ");
			guide.guest[i].setName(scan.next());
			System.out.print("성별 입력 : ");
			guide.guest[i].setGender(scan.next());
			System.out.println();
		}
		while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select = scan.nextInt();
			switch (select) {
			case 1: {
				for(int i=0; i<n; i++) {
				System.out.println("관광객 정보 \n 이름: "+guide.guest[i].getName()+" 성별: "+guide.guest[i].getGender()
						+" 목적지: "+Guide.point);
				}
				break;
			}
			case 2:{
				System.out.print("목적지 변경: ");
				guide.point = scan.next();
				System.out.print("목적지가 변경 되었습니다 \n"+guide.point);
				break;
			}
			case 3:{
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			}
			default:
				System.out.println("번호를 다시 선택해주세요");
				break;
			}
			
		}
		
		/*for(int i=0; i<n; i++) {
			System.out.println("이름: "+guide.guest[i].getName());
			System.out.println("성별: "+guide.guest[i].getGender());
		}
		*/
		
	}

}
