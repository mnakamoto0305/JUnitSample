package sample.junit;

import java.util.List;

public class ItemStock {

	private List<Item> itemList;

	public ItemStock(List<Item> itemList) {
		this.itemList = itemList;
	}

	public void add(Item item) {
		itemList.add(item);
	}

	public int getNum(Item item) {
		if (itemList.contains(item)) {
			int count = 0;
			for (Item array : itemList) {
				if (array.equals(item)) {
					count++;
				}
			}
			return count;
		} else {
			return 0;
		}
	}

}
