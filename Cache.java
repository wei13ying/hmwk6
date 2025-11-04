import java.util.ArrayList;
import java.util.List;

public class Cache<T> {
	private List<T> items;
	private int capacity;

	public Cache(int n) {
		this.capacity = n;
		this.items = new ArrayList<>(n);
	}

	 public void add(T item) {
		if (items.size() < capacity) {
		items.add(item);
		} else {
			items.remove(0);
			items.add(item);
		}
	}

	public boolean remove(T item) {
		return items.remove(item);
	}

	public boolean exists(T item) {
		return items.contains(item);
	}

	 public T getFirst() {
		if (items.isEmpty()) {
			return null;
		}
		return items.get(0);
	}

	public T getLast() {
		if (items.isEmpty()) {
			return null;
		}
		return items.get(items.size() - 1);
	}

	public T getItemByIndex(int i) {
		if (i < 0 || i >= items.size()) {
			return null;
		}
		return items.get(i);
	}
}
