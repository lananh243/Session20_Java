import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(10);
        listNumber.add(13);
        listNumber.add(12);
        listNumber.add(11);
        listNumber.add(6);
        listNumber.add(7);
        listNumber.add(8);
        System.out.println("Danh sách các số chẵn: ");
        listNumber.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
