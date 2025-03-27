package Bai3;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phoneNumber;

    public User(String name, Optional<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printlnfo() {
        Optional<String> phoneInfo = Optional.ofNullable(phoneNumber).orElse(Optional.of("Không có"));
        System.out.println("Tên: "+name+ ", Số điện thoại: "+phoneInfo.get());
    }
}
