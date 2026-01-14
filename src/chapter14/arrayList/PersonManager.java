package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {

		int select;
		Person p;

		// Person객체들만 저장할 ArraryList(personarr)
		ArrayList<Person> personarr = new ArrayList<Person>();

		p = new Person();
		while (true) {
			System.out.print("(1)회원가입, (2)정보삭제,(3)정보검색,(4)종료:");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();

			switch (select) {
			case 1: {

				System.out.print("이름: ");
				p.setName(scan.next());
				System.out.print("나이: ");
				p.setAge(scan.nextInt());
				System.out.print("전화번호: ");
				p.setTel(scan.next());

				personarr.add(new Person());
				System.out.println("회원가입 완료");
				break;
			}
			case 2: {
				System.out.println("---정보를 삭제합니다---");
				System.out.println("탈퇴한 회원 전화번호: ");
				String tel = scan.next();

				for (int i = 0; i < personarr.size(); i++) {
					if (personarr.get(i).getName().equals(tel)) {
						personarr.remove(i);
						System.out.println(tel + "님의 정보가 삭제되었습니다.");
						break;
					} else {
						if (i +1 == personarr.size()) {
							System.out.println(tel+"님의 정보가 없습니다");
						}
					}
				}
				break;
			}
			case 3: {
				Iterator<Person> it = personarr.iterator();
				/*for (int i = 0; i < it.size(); i++) {
					System.out.print(personarr.get(i).getName());
					System.out.print(personarr.get(i).getAge());
					System.out.print(personarr.get(i).getTel());
					System.out.println();
				}
				*/
				while(it.hasNext()) {
					p = it.next();//unBOxing
					System.out.println("---정보를 출력합니다--");
					System.out.println("등록인원은 " + personarr.size() + "명");
					System.out.println("이름: "+p.getName());
					System.out.println("나이: "+p.getAge());
					System.out.println("전화번호: "+p.getTel());
					System.out.println();
					
				}
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("잘못 누르셨습니다");
				break;
			}
		}

	}
}
