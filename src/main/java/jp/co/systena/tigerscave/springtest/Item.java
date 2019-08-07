package jp.co.systena.tigerscave.springtest;
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

	public Item(int itemId, String name,int price) {
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

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
