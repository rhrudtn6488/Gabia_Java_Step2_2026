package chapter08;

public class DmbCellPhoneMain_07 {

	public static void main(String[] args) {
		
		//11 Java폰 블랙
		
		DmbCellPhone dmb = new DmbCellPhone(11,"Java폰","블랙");
		
		//상속받은 필드
		System.out.println("모델: "+dmb.model);
		System.out.println("색상: "+dmb.color);
		
		//자식클래스 필드
		System.out.println("채널: "+dmb.channel);
		
		//전화통화 구현
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("네 안녕하세요");
		dmb.powerOff();
		dmb.hangUp();
	}

}
