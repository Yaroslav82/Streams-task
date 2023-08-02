package tasks;

import java.util.Map;
import java.util.stream.Stream;

public class Task03 {

    private static Stream<String> filterForecast(Map<String, Integer> forecast) {
        return forecast.entrySet().stream()
                .filter(day -> day.getValue() >= 10 && day.getValue() <= 13)
                .map(Map.Entry::getKey);
    }

    private static Map<String, Integer> getForecast() {
        return Map.of("Monday", 8, "Tuesday", 9, "Wednesday", 10, "Thursday", 11, "Friday", 12, "Saturday", 13, "Sunday", 14);
    }
}
