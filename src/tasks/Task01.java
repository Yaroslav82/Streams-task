package tasks;

import java.util.stream.Stream;

public class Task01 {

    private static Stream<String> filterNames(Stream<String> names, Character firstLetter) {
        return names.filter(name -> firstLetter.equals(name.charAt(0)));
    }

    private static Stream<String> getNames() {
        return Stream.of("Emma", "Liam", "Olivia", "Noah", "Ava", "Ethan", "Sophia", "Mason");
    }
}
