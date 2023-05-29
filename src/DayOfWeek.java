import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfYear = scanner.nextInt();

        String[] daysOfWeek = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        int dayOfWeekIndex = (dayOfYear - 1) % 7;
        if (dayOfWeekIndex < 0) {
            dayOfWeekIndex += 7;
        }
        String dayOfWeek = daysOfWeek[dayOfWeekIndex];
        System.out.println("День недели: " + dayOfWeek);
    }
}

