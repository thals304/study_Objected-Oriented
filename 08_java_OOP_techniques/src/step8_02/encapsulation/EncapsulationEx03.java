package step8_02.encapsulation;

// public class PublicC{}       // (가능) 단, 하나의 클래스 파일에는 하나의 public 클래스만 존재 가능 (이미 밑에서 사용하고 있어서 오류뜸)
class DefaultC{}                // (가능)
// protected class ProtectedC{} // (불가능) class는 public, default 접근제어자만 사용 가능
// private class privateC{}     // (불가능) class는 public, default 접근제어자만 사용 가능


class Test1 extends EncapsulationEx03{
	
	void test() {
		System.out.println(publicV);	 // 같은 프로젝트이므로 접근 가능
		System.out.println(defaultV);	 // 같은 패키지이므로 접근 가능
		System.out.println(protectedV);  // 상속 관계이므로 접근 가능
		// System.out.println(privateV); // (불가) 같은 클래스 내부가 아니므로 접근 불가능 > getter, setter를 통해서만 사용 가능
	
		publicM();		// 같은 프로젝트이므로 접근 가능
		defaultM();     // 같은 패키지이므로 접근 가능
		protectedM();   // 상속 관계이므로 접근 가능
		// privateM();  // (불가) 같은 클래스 내부가 아니므로 접근 불가
	}
}
public class EncapsulationEx03 {
	
	public int publicV;        // 프로젝트 전체에서 접근 가능
	int defaultV;   		   // 같은 패키지에서 접근가능
	protected int protectedV;  // 상속관계에서 접근 가능
	private int privateV;      // 같은 클래스 내부에서만 접근 가능
	
	public void publicM(){	}	 	// 프로젝트 전체에서 접근 가능
	void defaultM(){}				// 같은 패키지에서 접근가능
	protected void protectedM(){}	// 상속관계에서 접근 가능
	private void privateM(){}		// 같은 클래스 내부에서만 접근 가능
}
