package chapter07;

import java.util.Scanner;

public class BankMain_05 {

	public static void main(String[] args) {
		// 일산점 031-123-5678
		// 종로점 02-852-9856
		Scanner scan = new Scanner(System.in);
		System.out.print("지점명을 입력하세요: ");
		String point = scan.next();
		System.out.print("전화번호를 입력하세요: ");
		String tel = scan.next();
		Bank bank = new Bank(point, tel);
		
		//이자율 5.3f
		System.out.println(point + "지점의 퇴직연금의 이자를 입력하세요: ");
		Bank.interest = scan.nextFloat();
		bank.getBank();
		
		System.out.println();
		System.out.print("지점명을 입력하세요: ");
		String point2 = scan.next();
		System.out.print("전화번호를 입력하세요: ");
		String tel2 = scan.next();
		Bank bank2 = new Bank(point2, tel2);
		bank2.getBank();
	}

}
