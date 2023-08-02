package tasks;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task01 {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter to find names starting with that letter: ");
        String line = scanner.nextLine();
        if (line.length() == 1) {
            Character letter = line.toUpperCase().charAt(0);
            printNames(filterNames(getNames(), letter));
        } else {
            System.out.println("Incorrect value");
        }
    }

    private static void printNames(Stream<String> names) {
        AtomicInteger counter = new AtomicInteger(0);
        names.forEach(name -> System.out.println(counter.incrementAndGet() + ") " + name));
        if (counter.intValue() == 0) {
            System.out.println("There is no name for this letter");
        }
    }

    private static Stream<String> filterNames(Stream<String> names, Character firstLetter) {
        return names.filter(name -> Objects.nonNull(name) && firstLetter.equals(name.charAt(0)));
    }

    private static Stream<String> getNames() {
        return Stream.of("Emma", "Liam", "Olivia", null, "Noah", "Ava", "Ethan", "Sophia", "Mason");
    }
}
