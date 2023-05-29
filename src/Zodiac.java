import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введеите месяц: ");
        int month = in.nextInt();

        String zodiacSign = "";

        if (month == 1) {
            if (day <= 19)
                zodiacSign = "Козерог";
            else
                zodiacSign = "Водолей";
        } else if (month == 2) {
            if (day <= 18)
                zodiacSign = "Водолей";
            else
                zodiacSign = "Рыбы";
        } else if(month == 3) {
            if(day <= 20)
                zodiacSign = "Рыбы";
            else
                zodiacSign = "Овен";
        } else if(month == 4) {
            if(day <= 19)
                zodiacSign = "Овен";
            else
                zodiacSign = "Телец";
        } else if(month == 5) {
            if(day <= 20)
                zodiacSign = "Телец";
            else
                zodiacSign = "Близнецы";
        } else if(month == 6) {
            if(day <= 20)
                zodiacSign = "Близнецы";
            else
                zodiacSign = "Рак";
        } else if(month == 7) {
            if(day <= 22)
                zodiacSign = "Рак";
            else
                zodiacSign = "Лев";
        } else if(month == 8) {
            if(day <= 22)
                zodiacSign = "Лев";
            else
                zodiacSign = "Дева";
        } else if(month == 9) {
            if(day <= 22)
                zodiacSign = "Дева";
            else
                zodiacSign = "Весы";
        } else if(month == 10) {
            if(day <= 22)
                zodiacSign = "Весы";
            else
                zodiacSign = "Скорпион";
        } else if(month == 11) {
            if(day <= 21)
                zodiacSign = "Скорпион";
            else
                zodiacSign = "Стрелец";
        } else if(month == 12) {
            if(day <= 21)
                zodiacSign = "Стрелец";
            else
                zodiacSign = "Козерог";
        }

        System.out.println("Знак зодиака " + zodiacSign);
    }

}
