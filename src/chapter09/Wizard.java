package chapter09;

public class Wizard extends GameCharacter{

	@Override
	protected void atack() {
		System.out.println("마법사가 마법 공격을 합니다");
	}

	@Override
	protected void useUItimate() {
		System.out.println("마법사가 마법 스킬을 사용합니다");
		
	}

}
