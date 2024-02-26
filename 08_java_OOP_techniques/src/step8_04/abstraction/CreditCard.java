package step8_04.abstraction;

public interface CreditCard { // 어떤 메서드(행동)를 사용할 건지에 대한 목차 

	void purchasing();          // 구매결제
	void onlinePayments();      // 온라인 결제
	void cashAdvance();         // 현금인출
	void automaticPayments();   // 자동결제 설정
	void rewardPoints();        // 적립 포인트
	void milesAccumulation();   // 마일리지 적립
	void insuranceBenefits();   // 보험 혜택
	void emergencyServices();   // 긴급 서비스
	void installmentPatments(); // 할부 결제
}
