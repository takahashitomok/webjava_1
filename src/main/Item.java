
public class Item {
	private int itemId;
	private String name;
	private int price;

	/**
	 * 商品を作成する
	 * @param itemId 商品ID
	 * @param name 商品名
	 * @pram price 価格
	 */

	public Item1(int itemId, String name,int price) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public int getitemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public int setPrice(int price) {
		this.price = price;
	}


/*
	public int getProductCd() {
		return productCd;
	}
	public void setProductCd(int productCd) {
		this.productCd = productCd;
	}
	public String getSetProductNm() {
		return setProductNm;
	}
	public void setSetProductNm(String setProductNm) {
		this.setProductNm = setProductNm;
	}
	public int getSetProductPrice() {
		return setProductPrice;
	}
	public void setSetProductPrice(int setProductPrice) {
		this.setProductPrice = setProductPrice;
	}
*/
}
