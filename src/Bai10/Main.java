package Bai10;

import java.time.LocalDate;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "Quý", Optional.of("quy@example.com"));

        User u2 = new User(2, "Lan", null);

        User u3 = new User(3, "Huyền", Optional.of("huyen@example.com"));

        List<Task> tasks = List.of(

                new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),

                new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),

                new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),

                new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),

                new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true));


        tasks.stream().filter(task -> !task.isCompleted() && task.getDueDate().isBefore(LocalDate.of(2025, 03, 23)))
                .forEach(Task::displayTask);

        IntSummaryStatistics taskCompleted = tasks.stream().mapToInt(task -> task.isCompleted() ? 1 : 0).summaryStatistics();

        System.out.println("Tổng số công việc đã hoàn thành: " + taskCompleted.getSum());

        System.out.println("================== Thống kê theo người dùng =============");

        List<User> users = List.of(u1, u2, u3);
        LocalDate limitDate = LocalDate.of(2025, 3, 23);

        users.forEach(user -> {
            long totalTasks = tasks.stream().filter(t -> t.getAssignedTo() == user).count();
            long overdueTasks = tasks.stream().filter(t -> t.getAssignedTo() == user && !t.isCompleted() && t.getDueDate().isBefore(limitDate)).count();

            System.out.println(user.getName() + " | Email: " + user.getEmail().orElse("Không có email") +
                    " | Tổng: " + totalTasks + " | Quá hạn: " + overdueTasks);
        });

    }


}
