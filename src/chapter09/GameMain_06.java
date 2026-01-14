package chapter09;

public class GameMain_06 {

	public static void a(GameCharacter b) {
		b.fight();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("=============전사 전투================");
		a(new Warrior());
		System.out.println();
		System.out.println("============마법사 전투================");
		a(new Wizard());
		*/
		
		System.out.println("====전사 전투====");
		GameCharacter warrir = new Warrior();
		warrir.fight();
		System.out.println("\n====마법사 전투====");
		GameCharacter wizard = new Wizard();
		wizard.fight();
	}

}
