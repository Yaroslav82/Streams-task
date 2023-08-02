package tasks;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task02 {

    public static void main(String[] args) {
        getOutput(filterProducts(getProducts()));
    }

    private static void getOutput(Stream<String> products) {
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach(name -> System.out.println(counter.getAndIncrement() + ") " + name));
    }

    private static Stream<String> filterProducts(Map<String, Double> products) {
        return products.entrySet().stream()
                .filter(product -> product.getValue() <= 2)
                .map(Map.Entry::getKey);
    }

    private static Map<String, Double> getProducts() {
        return Map.of("pencil", 1.05, "notebook", 2.22, "book", 3.15, "pen", 1.75, "ruler", 2.00, "highlighter", 1.90);
    }
}
