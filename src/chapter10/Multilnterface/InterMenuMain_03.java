package chapter10.Multilnterface;

public class InterMenuMain_03 implements Inter_menu3{

	public static void main(String[] args) {
		InterMenuMain_03 im = new InterMenuMain_03();
		
		//부모(Inter_Menu3) = 자식(InterMenuMain_03)
		Inter_menu1 im1 = im;//업캐스팅
		Inter_menu2 im2 = im;//업캐스팅
		Inter_menu3 im3 = im;//업캐스팅
		System.out.println("-----Inter_menu1-----");
		System.out.println(im1.jajange());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("-----Inter_menu2-----");
		System.out.println(im2.tangsuyuck());
		
	}

	@Override
	public String jajange() {
		return "하나죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "해장하세요";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "찹살 탕수육";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "후난식 볶음밥 강추!";
	}

}
