package client;

import java.util.Scanner;

import dummy.DummyData;
import model.Item;
import model.ItemList;
import view.ItemView;
import view.MenuView;

public class Client {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		ItemList list = new ItemList();
		DummyData.ddFiller(list);

		System.out.println("--- A simple ToDo-List: ---");

		int wahl = -1;
		MenuView.listMenu();
		while (wahl != 0) {
			System.out.print("Choose menu option: ");
			wahl = keyboard.nextInt();
			
			if (wahl == 0) {
				System.out.println("Bye Bye");
				
			} else if (wahl == 1) {
				ItemView.displayItems(list);
				
			} else if (wahl == 2) {
				System.out.print("Add new item: ");
				String itemName = keyboard.next();
				list.createNew(new Item(itemName));
				System.out.println();
				ItemView.displayItems(list);
				
			} else if (wahl == 3) {
				System.out.print("Switch status for item: ");
				list.switchStatus(keyboard.nextInt());
				System.out.println();
				ItemView.displayItems(list);
				
			} else if (wahl == 4) {
				System.out.print("Rename item: ");
				int id = keyboard.nextInt();
				String newItemName = keyboard.next();
				list.renameItem(id, newItemName);
				System.out.println();
				ItemView.displayItems(list);
				
			} else {
				System.out.println("da war was falsch");
			}

		}

		keyboard.close();

	}
}
