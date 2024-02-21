package step8_02.encapsulation;
/*

# Getter & Setter

- 캡슐화는 객체의 데이터를 외부에서 직접 접근하는 것을 제한하여 객체의 상태를 보호하고
 객체와 상호작용하는 방식을 제어하는 객체 지향 프로그래밍의 핵심 원칙 중 하나이다.
 Getter와 Setter 메서드를 통해 이를 구현할 수 있다.
- getter : 접근 , setter : 수정

*/
class Unit {
	
	private String name;
	private int hp;
	
	// getter : private 변수를 외부로 반환하는 메서드
	String getName() { // 변수명 앞에 get을 추가하여 메서드 이름을 작성함
		return name;
	}
	// setter : private 변수를 외부로 수정하는 메서드
	void setName(String name) { // 변수명 앞에 set을 추가하여 메서드 이름을 작성함
		// this를 생략할 수 없음 
		// java에서는 this를 현재 객체를 가리키는 참조로서 멤버 변수인 name과 파라미터 name을 구분하기 위해 써야함
		this.name = name; 
	}
	
	int getHp() {
		return hp;
	}
	void setHp (int hp) {
		this.hp = hp;
	}
}

public class EncapsulationEx02 {

	public static void main(String[] args) {
		
		Unit unit = new Unit();
		
		// unit.name = "tank";
		// unit.hp = 100;
		
		// setter를 사용해 private 필드를 수정
		unit.setName("tank");
		unit.setHp(100);
		
		// System.out.println(unit.name);
		// System.out.println(unit.hp);
		
		// getter를 사용해 private 필드를 반환
		System.out.println(unit.getName());
		System.out.println(unit.getHp());
		System.out.println();
		
		ProductDTO productDTO = new ProductDTO();
		
		productDTO.setProductID(1);
		productDTO.setProductNm("기계식 키보드");
		productDTO.setPrice(40000);
		productDTO.setBrandId(1);
		productDTO.setBrandNm("로지택");
		
		System.out.println(productDTO.getProductID());
		System.out.println(productDTO.getProductNm());
		System.out.println(productDTO.getPrice());
		System.out.println(productDTO.getBrandId());
		System.out.println(productDTO.getBrandNm());
	}

}
