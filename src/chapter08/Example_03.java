package chapter08;

import java.util.Scanner;

public class Example_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("공격력을 입력해주세요: ");
		int b = scan.nextInt();

		// 메서드 활용
		System.out.println("전사의 공격력: "+useSkill(new Warrior(),b));
		System.out.println("마법사의 공격력: "+useSkill(new Mage(),b));
		
	}
	//----------------------------------
	//메서드
	public static int useSkill(Character a, int b) {
		return a.attack(b);
	}
}
