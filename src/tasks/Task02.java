package tasks;

import java.util.Map;
import java.util.stream.Stream;

public class Task02 {

    private static Stream<String> filterProducts(Map<String, Double> products) {
        return products.entrySet().stream().filter(product -> product.getValue() <= 2).map(Map.Entry::getKey);
    }

    private static Map<String, Double> getProducts() {
        return Map.of("pencil", 1.05, "notebook", 2.22, "book", 3.15, "pen", 1.75, "ruler", 2.00, "highlighter", 1.90);
    }
}
