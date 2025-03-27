package Bai9;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    LocalDate createdDate;
    Optional<LocalDate> deliveryDate;

    public Order() {
    }

    public Order(int id, String customerName, LocalDate createdDate, Optional<LocalDate> deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }


    public void toDisplayString() {
        String deliveryDateString = deliveryDate.map(LocalDate::toString).orElse("Chưa giao");
        System.out.println("Mã đơn hàng: "+this.id+ " - Tên khách hàng: "+this.customerName+ " - Ngày đặt hàng: "+this.createdDate+ " - Ngày giao hàng: "+deliveryDateString);
    }
}
