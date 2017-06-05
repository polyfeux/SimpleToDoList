package model;

public class Item {
	private int id;
	private String name;
	private String description;
	private ItemStatus status;

	public Item(String name) {
		this.name = name;
		this.status = ItemStatus.TODO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemStatus getStatus() {
		return status;
	}

	public void setStatus(ItemStatus status) {
		this.status = status;
	}

	public String toString() {
		return name;
	}

}
