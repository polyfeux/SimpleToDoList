package dummy;

import model.Item;
import model.ItemList;
import model.ItemStatus;

public class DummyData {
	public static void ddFiller(ItemList list) {
//		if (list != null) {
		list.createNew(new Item("item1"));
		list.createNew(new Item("item2"));
		list.createNew(new Item("item3")).setStatus(ItemStatus.DONE);
		list.createNew(new Item("item4")).setStatus(ItemStatus.DONE);
		list.createNew(new Item("item5"));
		list.createNew(new Item("item6")).setStatus(ItemStatus.DONE);
		list.createNew(new Item("item7"));
//		}
	}
}
