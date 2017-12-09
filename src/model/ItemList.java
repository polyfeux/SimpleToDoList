package model;

import java.util.ArrayList;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<>();

	private static int counter = 0;

	public Item createNew(Item i) {
		i.setId(counter++);
		items.add(i);
		return i;
	}

	public Item remove(Item i) {
		Item temp = i;
		items.remove(i);
		return temp;
	}

	public Item getItemById(int id) {
		Item i = items.get(id);
		return i;
	}

	public ItemList switchStatus(int id) {
		Item temp = this.getItemById(id);

		if (temp.getStatus() == ItemStatus.DONE) {
			temp.setStatus(ItemStatus.TODO);
		} else {
			temp.setStatus(ItemStatus.DONE);
		}

		return this;
	}
	
	public ItemList renameItem(int id, String newName) {
		Item temp = this.getItemById(id);
		temp.setName(newName);
		
		return this;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();

		for (Item item : items) {
			s.append(item.getId());
			s.append(" ");
			s.append(item.getStatus());
			s.append(" ");
			s.append(item.getName());
			s.append("\n");
		}

		// letzten Zeilenumbruch "\n" entfernen
		return s.toString().substring(0, s.length() - 1);
	}
}
