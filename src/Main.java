import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapYear(int year) {
        boolean leapYear = checkLeapYear(year);
        System.out.println(year + " год " + (leapYear ? "" : "не") + "високосный");
    }


    public static void task1() {
        System.out.println("Задача 1. Про високосный год");
        int year = 2037;
        printLeapYear(year);
        System.out.println();
    }

    public static void printForPhone(int year, int os) {
        if (os < 0 || os > 1) {
            System.out.println("Необходимо ввести версию ОС 0 или 1");
            return;
        }
        StringBuilder result = new StringBuilder("Установите ");
        if (checkYearPhone(year)) {
            result.append("облегченную версию для ");
        } else {
            result.append(" приложение по ссылке для ");
        }
        if (os == 0) {
            result.append("IOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }

    public static boolean checkYearPhone(int year) {
        int currentYear = LocalDate.now().getYear();
        return year < currentYear;
    }

    public static void task2() {
        System.out.println("Задача 2. Про версии приложения");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        printForPhone(clientDeviceYear, clientOS);
        System.out.println();
    }

    public static int countDayOfDelivery(int distance) {
        if (distance < 0 || distance > 100) {
            return 0;
        } else if (distance > 0 && distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printDeliveryDay(int distance) {
        int day = countDayOfDelivery(distance);
        System.out.println("Потребуется дней доставки: " + day + "дн.");
    }

    public static void printMistakeOfDelivery() {
        System.out.println("Доставка невозможна на данное расстояние");
    }

    public static void task3() {
        System.out.println("Задача 3. Про доставку");
        int deliveryDistance = 95;
        if (countDayOfDelivery(deliveryDistance) == 0) {
            printMistakeOfDelivery();
        } else {
            printDeliveryDay(deliveryDistance);
        }

    }

}