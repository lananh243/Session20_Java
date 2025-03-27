package Bai9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.of(LocalDate.of(2025, 3, 25))),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), Optional.empty()),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.of(LocalDate.of(2025, 3, 23))),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), Optional.empty()),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.of(LocalDate.of(2025, 3, 30)))
        );

        System.out.println("================= Danh sách đơn hàng đã giao ==============");
        orders.stream()
                .filter(order -> order.getDeliveryDate().isPresent())
                .forEach(Order::toDisplayString);

        System.out.println("================ Danh sách đơn hàng chưa giao ==================");
        orders.stream()
                .filter(order -> order.getDeliveryDate().isEmpty())
                .forEach(Order::toDisplayString);

        LocalDate startDate = LocalDate.of(2025, 3, 17);
        LocalDate endDate = LocalDate.of(2025, 3, 23);

        long deliveredCount = orders.stream()
                .filter(order -> order.getDeliveryDate()
                        .map(date -> date.isBefore(startDate) && date.isAfter(endDate))
                        .orElse(true))
                .count();


        System.out.println("Số đơn hàng đã giao từ ngày " + startDate + " đến " + endDate + " là: " + deliveredCount);
    }
}
