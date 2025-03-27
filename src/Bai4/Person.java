package Bai4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(LocalDate birthDate, String name) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public void getAge() {
        LocalDate now = LocalDate.now();
        LocalDate dateOfBirth = birthDate.minusDays(now.getDayOfMonth());

        Period  period = Period.between(dateOfBirth, now);
        System.out.println("Tuổi:  " + period.getYears());
    }
    public void printlnfo() {
        System.out.println("Tên: "+this.name+ ", Ngày sinh: "+this.birthDate);
        getAge();
    }
}
