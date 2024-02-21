package accessModifierTest;

import step8_02.encapsulation.EncapsulationEx03;

public class Test2 extends EncapsulationEx03 {
	
	void test() {
		System.out.println(publicV);	 // 같은 프로젝트이므로 접근 가능
		// System.out.println(defaultV);	 // (불가) 같은 패키지가 아니므로 접근 불가능
		System.out.println(protectedV);  // 상속 관계이므로 접근 가능
		// System.out.println(privateV); // (불가) 같은 클래스 내부가 아니므로 접근 불가능 
	
		publicM();		// 같은 프로젝트이므로 접근 가능
		// defaultM();     // (불가) 같은 패키지가 아니므로 접근 불가능
		protectedM();   // 상속 관계이므로 접근 가능
		// privateM();  // (불가) 같은 클래스 내부가 아니므로 접근 불가능
	}
}
