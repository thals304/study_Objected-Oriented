package step7_01.objectArray;

import java.util.HashMap;

/*
  
  	 # 컬렉션 프레임워크(collection framework) HashMap
  	 
 	- HashMap은 K(Key)에 V(Value)를 할당 방식으로 데이터가 저장하는 데이터 형식이다.
	- HashMap은 순서와 상관없이 key로 데이터를 저장 및 관리한다.
	- HashMap 생성방법
	
		HashMap<키, 값> 변수명 = new HashMap<키, 값>();
		HashMap<키, 값> 변수명 = new HashMap<>();						// new 뒤쪽의 generic은 생략 가능하다.
		
		Ex)
		 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		 HashMap<String, Integer> hmap = new HashMap<>();				 
		 
		 설명)
		 HashMap<String,Integer> : key의 타입은 String이고 저장될 데이터의 타입은 Integer이다.
		 HashMap<String,String>  : key의 타입은 String이고 저장될 데이터의 타입은 String이다.
		 HashMap<String,Object>  : key의 타입은 String이고 저장될 데이터의 타입은 Object이다.
		 HashMap<String,Product> : key의 타입은 String이고 저장될 데이터의 타입은 Product이다.
		 HashMap<String,Member>  : key의 타입은 String이고 저장될 데이터의 타입은 Member이다.


*/

class TempMember {
	
	String id;
	String passwd;
	String name;
	String email;
	String address;
}


public class ObjectArrayEx12 {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		// put(key, value) : HashMap의 key에 value를 할당한다. 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);
		System.out.println(hMap);  // hashmap은 순서와는 전혀 관계 없음
		System.out.println("\n===============================\n");
		
		hMap.put("data1", 10000); 	// 키가 같으면 수정
		hMap.put("data2", 20000); 	// 키가 같으면 수정
		hMap.put("data3", 30000); 	// 키가 같으면 수정
		hMap.put("data4", 4000);	// hashmap에 없는 키가 추가되면 데이터 추가 
		hMap.put("data5", 5000);	// hashmap에 없는 키가 추가되면 데이터 추가 
		
		System.out.println(hMap); 
		System.out.println("\n===============================\n");
		
		// size() : HashMap의 데이터개수를 반환한다.
		System.out.println( "개수 : "+ hMap.size());
		System.out.println("\n===============================\n");
		
		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hMap.get("data1"));
		System.out.println(hMap.get("data2"));
		System.out.println(hMap.get("data3"));
		System.out.println(hMap.get("data4"));
		System.out.println(hMap.get("data5"));
		System.out.println("\n===============================\n");
		
		// keySet() : HashMap의 key만 얻어온다.
		System.out.println(hMap.keySet());
		
		for ( String key : hMap.keySet()) {
			System.out.println(key + " : " + hMap.get(key));
		}
		System.out.println("\n===============================\n");
		
		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.
		hMap.remove("data1");
		hMap.remove("data2");
		hMap.remove("data3");
		System.out.println(hMap);
		System.out.println("\n===============================\n");
		
		hMap.clear(); // HashMap의 모든 데이터만 삭제
		// hMap.put("data1", 1000); 바로 put, remove, get 등등 가능
		
		hMap = null;  // HashMap 자체를 삭제 
		// hMap.put("data1",1000); 바로 put 불가능 -> 다시 만들어야 함
		hMap = new HashMap<String, Integer>();
		
		// 웹에서 자주 사용하는 예시 1
		TempMember temp1 = new TempMember();	// temp1은 주소(링크)
		temp1.id      = "user1";	
		temp1.name    = "유저1";
		temp1.passwd  = "1";
		temp1.email   = "1@gamil.com";
		temp1.address = "서울";
		
		TempMember temp2 = new TempMember();
		temp2.id      = "user2";
		temp2.name    = "유저2";
		temp2.passwd  = "2";
		temp2.email   = "2@gamil.com";
		temp2.address = "경기";
		
		TempMember temp3 = new TempMember();
		temp3.id      = "user3";
		temp3.name    = "유저3";
		temp3.passwd  = "3";
		temp3.email   = "3@gamil.com";
		temp3.address = "인천";
		
		HashMap<String, TempMember> mapEx01 = new HashMap<String, TempMember>();
		// arryaList는 순서가 있기 때문에 name을 알고 싶다고 했을 때
		// 인덱스 번호를 알아야한다는 번거로움이 있음
		// 근데 HashMapd은 대장 역할(key)을 id라고 정해두고 주소(링크)를 value로 하면 
		// 얼마든지 name, email, address 등을 뽑아낼 수 있음
		mapEx01.put(temp1.id, temp1); 	
		mapEx01.put(temp2.id, temp2);
		mapEx01.put(temp3.id, temp3);
		
		System.out.println(mapEx01);
		System.out.println(mapEx01.get(temp1.id).name);
		System.out.println(mapEx01.get(temp1.id).email);
		System.out.println(mapEx01);
		System.out.println("\n===============================\n");
		
		// 웹에서 자주 사용하는 예시 2 (예시 1보다 2가 실제로 사용하는 경우가 더 많음)
		HashMap<String,Object> mapEx02 = new HashMap<String, Object>();
		mapEx02.put("id", "user4");
		mapEx02.put("name", "유저4");
		mapEx02.put("passwd", "4");
		mapEx02.put("email", "4@gmail.com");
		mapEx02.put("address", "부산");
		// 클래스 외에 추가적으로 데이터 저장이 가능
		mapEx02.put("isPcLogin", true);
		mapEx02.put("role", "VIP"); 
		mapEx02.put("browser", "chrome"); 
		
		System.out.println(mapEx02);
		System.out.println("\n===============================\n");
		
		// 참고) Object 타입을 명시할경우 서로 다른데이터를 저장할 수 있다.
		HashMap<String, Object> testMap = new HashMap<String, Object>();
		testMap.put("key1", "문자열");
		testMap.put("key2", 100);
		testMap.put("key3", true);
		testMap.put("key4", 3.14);
		testMap.put("key5", 'p');
		testMap.put("key6", new TempMember());
		testMap.put("key7", new Product());
		
		
	}

}
