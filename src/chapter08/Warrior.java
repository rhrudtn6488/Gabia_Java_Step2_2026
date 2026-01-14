package chapter08;

public class Warrior extends Character{

	@Override
	public int attack(int power) {
		int pow = power*2;
		return pow;
	}

}
