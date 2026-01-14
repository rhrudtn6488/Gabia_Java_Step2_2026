package chapter10.Multilnterface;

public interface Inter_menu1 {
	abstract String jajange();
	
	String jjambbong();
	
	default void show() {
		System.out.println("맛집~~~~");
	}
}
