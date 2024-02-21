package step8_02.encapsulation;
// DTO(Data Transfer Object) : 데이터 전송 객체
// VO (Value Object) : 값(데이터) 객체
// BO (Business Object) : 비즈니스 객체

public class ProductDTO {
	
	private long productID;
	private String productNm;
	private int price;
	private long brandId;
	private String brandNm;
	
	/*
	  - getter & setter 생성 단축기
	  
	  좌측 상단 Source > Generate Getters and Setters > Select All > Generate
	  
	 */
	
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getBrandId() {
		return brandId;
	}
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	
}
