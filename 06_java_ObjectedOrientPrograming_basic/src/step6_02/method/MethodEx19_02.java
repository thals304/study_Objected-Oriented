package step6_02.method;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 필드 초기화(init)

class GoodsDTO {
	
	String goodsCd;
	String goodsNm;
	int goodsPrice;
	
	void setData(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	// 생성자 자동완성키 Source > Generate Constructor Using Fields 
	public GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {

		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println("goodsCd : " + this.goodsCd);
		System.out.println("goodsNm : " + this.goodsNm);
		System.out.println("goodsPrice : " + this.goodsPrice);
		System.out.println();
	}
}
public class MethodEx19_02 {

	public static void main(String[] args) {
		
		// (before)
		// GoodsDTO goodsDTO = new GoodsDTO();
		// goodsDTO.setData("0x001", "셔츠", 30000);
		// goodsDTO.printData();
		
		// (after)
		GoodsDTO goods1 = new GoodsDTO("0x001", "셔츠", 30000);
		goods1.printData();
		
		GoodsDTO goods2 = new GoodsDTO("0x002", "데님바지", 50000);
		goods2.printData();
		
		GoodsDTO goods3 = new GoodsDTO("0x003", "양말", 2000);
		goods3.printData();
		
		// 생성자 사용 예시
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("#,##0");
	}

}
