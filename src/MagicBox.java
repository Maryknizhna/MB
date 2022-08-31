import java.util.Random;

public class MagicBox<T> {

    protected T[] items;

    public MagicBox(int count) {
        this.items = (T[]) new Object[count];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int cell = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                cell++;
            }
        }
        if (items.length - cell != 0) {
            throw new RuntimeException("Коробка не полна, осталось еще заполнить ячеек: " + (items.length - cell));
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}
