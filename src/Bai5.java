import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);

        Optional<Integer> normalSecondLargest = normalList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        Optional<Integer> singleSecondLargest = singleElementList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        Optional<Integer> allSameSecondLargest = allSameList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (normalSecondLargest.isPresent()) {
            System.out.println("Số lớn thứ 2: "+normalSecondLargest.get());
        } else {
            System.out.println("Ko tìm thấy số lớn thứ hai");
        }

        if (singleSecondLargest.isPresent()) {
            System.out.println("Số lớn thứ 2: "+singleSecondLargest.get());
        } else {
            System.out.println("Ko tìm thấy số lớn thứ hai");
        }

        if (allSameSecondLargest.isPresent()) {
            System.out.println("Số lớn thứ 2: "+allSameSecondLargest.get());
        } else {
            System.out.println("Ko tìm thấy số lớn thứ hai");
        }
    }
}
