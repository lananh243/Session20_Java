import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(11);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(15);
        listNumber.add(7);
        listNumber.add(8);
        listNumber.add(29);
        listNumber.add(10);

        System.out.println("Tổng các số lẻ: "+listNumber.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum));
    }
}
