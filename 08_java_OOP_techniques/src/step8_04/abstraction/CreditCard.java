package step8_04.abstraction;

public interface CreditCard { // 어떤 메서드(행동)를 사용할 건지에 대한 목차 

	public void purchasing();          // 구매결제
	public void onlinePayments();      // 온라인 결제
	public void cashAdvance();         // 현금인출
	public void automaticPayments();   // 자동결제 설정
	public void rewardPoints();        // 적립 포인트
	public void milesAccumulation();   // 마일리지 적립
	public void insuranceBenefits();   // 보험 혜택
	public void emergencyServices();   // 긴급 서비스
	public void installmentPatments(); // 할부 결제
}
