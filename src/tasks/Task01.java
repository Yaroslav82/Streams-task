package tasks;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task01 {

    private static void printNames(Stream<String> names) {
        AtomicInteger counter = new AtomicInteger(0);
        names.forEach(name -> System.out.println(counter.incrementAndGet() + ") " + name));
        if (counter.intValue() == 0) {
            System.out.println("There is no name for this letter");
        }
    }

    private static Stream<String> filterNames(Stream<String> names, Character firstLetter) {
        return names.filter(name -> firstLetter.equals(name.charAt(0)));
    }

    private static Stream<String> getNames() {
        return Stream.of("Emma", "Liam", "Olivia", "Noah", "Ava", "Ethan", "Sophia", "Mason");
    }
}
