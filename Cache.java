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
}
