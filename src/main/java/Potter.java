import java.util.*;

public class Potter {
    public int BOOK_PRICE = 8;

    public Map<Integer, Float> discounts = new HashMap<>();

    Potter() {
        discounts.put(5, 0.25f);
        discounts.put(4, 0.2f);
        discounts.put(3, 0.15f);
        discounts.put(2, 0.05f);
        discounts.put(1, 0f);
        discounts.put(0, 0f);


    }

    public float price(List<Integer> books) {

        float total = 0f;
        while (books.size() != 0) {
            Set<Integer> uniqueBooks = new HashSet<>(books);

            total += BOOK_PRICE * uniqueBooks.size() * (1 - discounts.get(uniqueBooks.size()));

            uniqueBooks.forEach(item -> books.remove(books.indexOf(item)));
        }

        return total;
    }
}