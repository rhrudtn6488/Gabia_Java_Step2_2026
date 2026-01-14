package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap{
	
	private HashMap<Integer, String> hashMap;
	
	//생성자(HashMap 참조 메모리 확보)
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer,String>();
	}
	
	//addMember
	public void addMember(Member m) {
		hashMap.put(m.memberId(), m.memberName());
	}
	//removeMembver: hashMap.containsKey(memberId)
	public boolean removeMember(int memberID) {
		while(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember() {
//		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			String member = hashMap.get(key);
			System.out.println(member+": "+key);
		}
	}
	
}
