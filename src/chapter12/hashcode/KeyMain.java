package chapter12.hashcode;

public class KeyMain {

	public static void main(String[] args) {

		Key hashkey1 = new Key(10);
		Key hashkey2 = new Key(10);
		Key hashkey3 = new Key("고경수");
		Key hashkey4 = new Key("고경수");
		
		
		System.out.println(hashkey1);
		System.out.println(hashkey2);
		System.out.println(hashkey3);
		System.out.println(hashkey4);
		
		//int
		if (hashkey3.equals(hashkey4)) {

			System.out.println("True");

		}
		else {
			System.out.println("false");
		}
		
		//String
		if (hashkey3.name.equals("고경수")) {

			System.out.println("True");

		}
		else {
			System.out.println("false");
		}
	}

}
