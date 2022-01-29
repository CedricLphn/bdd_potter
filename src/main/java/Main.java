import java.util.*;

public class Main {

    public static void main(String[] args) {
        Potter potter = new Potter();

        List<Integer> book = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(potter.price(book));
    }

}
