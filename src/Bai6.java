import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Thời điểm xử lý: " + now);


        Map<String, Long> currentItem = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        currentItem.forEach((item, count)  -> System.out.println(item + " : " + count));
    }
}
