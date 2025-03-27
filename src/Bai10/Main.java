package Bai10;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    User u1 = new User(1, "Quý", Optional.of("quy@example.com"));

    User u2 = new User(2, "Lan", null);

    User u3 = new User(3, "Huyền", Optional.of("huyen@example.com"));

    List<Task> tasks = List.of(

            new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),

            new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),

            new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),

            new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),

            new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true));
}
