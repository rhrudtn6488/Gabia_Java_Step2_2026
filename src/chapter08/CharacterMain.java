package chapter08;

import java.util.Scanner;

public class CharacterMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("공격력을 입력해주세요: ");
		int b = scan.nextInt();
		
		Character[] ch = {new Warrior(), new Mage()};
		
		for(Character a : ch) {
			System.out.println(a.getClass().getSimpleName()+"의 공격력 : "+ a.attack(b));
		}
	}

	
}
