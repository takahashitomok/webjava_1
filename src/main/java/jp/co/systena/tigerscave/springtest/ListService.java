package jp.co.systena.tigerscave.springtest;
import java.util.ArrayList;
import java.util.List;

public class ListService {

	//商品一覧を取得する
	public List<Item> getItemList(){
	Item item1 = new Item(1,"掃除機",1000);
	Item item2 = new Item(2,"テレビ",1500);
	Item item3 = new Item(3,"冷蔵庫",2000);

    List<Item> itemList = new ArrayList<Item>();
    itemList.add(item1);
    itemList.add(item2);
    itemList.add(item3);

    return itemList;
    }
}
