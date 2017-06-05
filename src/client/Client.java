package client;

import java.util.Scanner;

import dummy.DummyData;
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
			wahl = keyboard.nextInt();

			switch (wahl) {
			case 0:
				System.out.println("Bye Bye");
				break;
			case 1:
				ItemView.displayItems(list);
				break;
			case 2:
				System.out.println("case2");
				break;
			case 3:
				System.out.println("case3");
				break;
			default:
				System.out.println("da war was falsch");
				break;
			}
		}

		keyboard.close();

	}
}
