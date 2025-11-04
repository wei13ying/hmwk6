public class CacheTest {
	public static void main(String[] args) {
		Cache<String> cache = new Cache<>(4);
		cache.add("а");
		cache.add("б");
		cache.add("в");
		cache.add("г");

		System.out.println("последний элемент: " + cache.getLast());
		cache.add("д");
		System.out.println("после добавления д: " + cache.getLast());
		System.out.println("элемент по индексу 0: " + cache.getItemByIndex(0));
		System.out.println("элемент по индексу 3: " + cache.getItemByIndex(3));
		System.out.println("элемент по индексу 10: " + cache.getItemByIndex(10));
		System.out.println("содержит 'в'? " + cache.exists("в"));
		System.out.println("содержит 'а'? " + cache.exists("а"));
		System.out.println("первый элемент: " + cache.getFirst());
		boolean removed = cache.remove("б");
		System.out.println("удален 'б'? " + removed);
		System.out.println("текущий список: " + cache.getItems());
		boolean removed2 = cache.remove("несуществующий");
		System.out.println("удален 'несуществующий'? " + removed2);

	}
}

