package chapter08;

public class Mage extends Character{

	@Override
	public int attack(int power) {
		int pow = power*3;
		return pow;
	}

}
