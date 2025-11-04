import java.util.ArrayList;
import java.util.List;

public class Cache<T> {
	private List<T> items;
	private int capacity;

	public Cache(int n) {
		this.capacity = n;
		this.items = new ArrayList<>(n);
	}
}
