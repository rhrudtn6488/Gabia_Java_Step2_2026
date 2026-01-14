package chapter15.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapMain_05 {

	public static void main(String[] args) {

		// Collectopns.synchronizedMap 객체 생성 및 데이터 추가
		Map<String, Integer> inventory = Collections.synchronizedMap(new HashMap<>());

		inventory.put("apple", 50);
		inventory.put("banana", 30);
		inventory.put("grape", 20);
		inventory.put("orange", 10);

		//HashMap 출력(순서가 보장되지 않음)
		System.out.println("--------HashMap 출력(순서 무작위)-----------");
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// HashMap 객체 생성 및 데이터 추가
		Map<String, String> linkedhashMap = new LinkedHashMap<String, String>();
		linkedhashMap.put("apple", "red");
		linkedhashMap.put("banana", "yellow");
		linkedhashMap.put("grape", "purple");
		linkedhashMap.put("orange", "orange");
		
		//HashMap 출력(순서가 보장됨)
		System.out.println("--------HashMap 출력(순서 보장)-----------");
		for (Map.Entry<String, String> entry : linkedhashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
