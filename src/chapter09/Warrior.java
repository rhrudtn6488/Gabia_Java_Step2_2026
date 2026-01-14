package chapter09;

public class Warrior extends GameCharacter{

	@Override
	protected void atack() {
		System.out.println("전사가 근접 공격합니다");
		
	}

	@Override
	protected void useUItimate() {
		System.out.println("전사가 근접 스킬을 사용합니다");
		
	}

}
