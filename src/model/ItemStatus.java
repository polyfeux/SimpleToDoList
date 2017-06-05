package model;

public enum ItemStatus {
	TODO, DONE;

	public String toString() {
		switch (this) {
		case TODO:
			return "[ ]";
		case DONE:
			return "[x]";
		default:
			throw new IllegalArgumentException();
		}
	}
}
