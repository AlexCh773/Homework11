import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("task1:");
        short year = 2021;
        checkTheLeapYearAndReport(year);
    }

    public static void checkTheLeapYearAndReport(short year) {
        if (year < 1) {
            System.out.println("год не может быть отрицательным или нулевым числом");
        } else if (year % 4 != 0) {
            System.out.println(year + " год — невисокосный год");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год — невисокосный год");
        } else {
            System.out.println(year + " год — високосный год");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");
        byte typeOfOperatingSystem = 0;
        short yearOfDeviseRelease = 2023;
        selectAppVersionAndReport(typeOfOperatingSystem, yearOfDeviseRelease);
    }

    public static void selectAppVersionAndReport(byte typeOfOperatingSystem, short yearOfDeviseRelease) {
        int currentYear = LocalDate.now().getYear();
        String stringTypeOfOS;
        String stringAppVersion;
        if ((typeOfOperatingSystem != 0 && typeOfOperatingSystem != 1) || yearOfDeviseRelease < 1 || yearOfDeviseRelease > currentYear) {
            System.out.println("неверные входные данные!");
            return;
        }
        if (typeOfOperatingSystem == 1) {
            stringTypeOfOS = "Android";
        } else {
            stringTypeOfOS = "iOS";
        }
        if (yearOfDeviseRelease < currentYear) {
            stringAppVersion = "облегченная";
        } else stringAppVersion = "обычная";
        System.out.println("Установите приложение для " + stringTypeOfOS + " - версия " + stringAppVersion);
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        short deliveryDistance = 35;
        short deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println("На доставку потребуется дней: " + deliveryTime);
    }

    public static short calculateDeliveryTime(short deliveryDistance) {
        short deliveryDistanceZone1 = 20, deliveryDistanceZone2 = 60, deliveryDistanceZone3 = 100;
        short baseDeliveryTime = 1;
        short deliveryTime = 0;
        if (deliveryDistance < 1 || deliveryDistance > deliveryDistanceZone3) {
            return deliveryTime;
        } else if (deliveryDistance <= deliveryDistanceZone1) {
            deliveryTime = baseDeliveryTime;
        } else if (deliveryDistance <= deliveryDistanceZone2) {
            deliveryTime = (short) (baseDeliveryTime + 1);
        } else if (deliveryDistance <= deliveryDistanceZone3) {
            deliveryTime = (short) (baseDeliveryTime + 2);
        }
        return deliveryTime;
    }
}