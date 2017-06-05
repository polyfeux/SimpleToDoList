package client;

import java.util.Scanner;

import model.Item;
import model.ItemList;
import model.ItemStatus;

public class Client {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("A simple ToDo-List:\n");

		ItemList list = new ItemList();
		list.add(new Item("item1"));
		list.add(new Item("item2"));
		list.add(new Item("item3")).setStatus(ItemStatus.DONE);

		System.out.println(list);

		System.out.println(list.getItemById(2));

		String s = keyboard.next();

		if (s.equals("ls")) {
			System.out.println(list);
		} else {
			System.out.println(list.getItemById(Integer.parseInt(s)));
		}

		
		while (!keyboard.next().equals("q")) {
			System.out.println(list);
			System.out.println("mach was!, drueck -q- zum beenden!");
		}

		keyboard.close();

	}
}
