public class Main {
    public static void main(String[] args) {
        int year = 2021;
        System.out.println(year + calculateLeapYear(year));

        int OS = 1;
        int deviceDate = 2013;
        System.out.println(insertingDeviceParameters(OS, deviceDate));

        int distanceOfDelivery = 102;
        System.out.println(calculatingDeliveryDays(distanceOfDelivery));
    }

    public static String calculateLeapYear (int Y) {
        if ((Y >= 1584) && (Y % 4 == 0) && (Y % 100 != 0) || (Y % 400 == 0)) {
            //System.out.println("Указанный год является високосным");
            return (" год - високосный год");
        } else {
            //System.out.println("Указанный год НЕ является високосным");
            return (" год - невисокосный год");
        }
    }

    public static String insertingDeviceParameters (int operatingSystem, int deviceProductionDate) {
        switch (operatingSystem) {
            case 0:
                if (deviceProductionDate < 2015) {
                    return("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    return("Установите версию приложения для iOS по ссылке");
                }
            case 1:
                if (deviceProductionDate < 2015) {
                    return("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    return("Установите версию приложения для Android по ссылке");
                }
            default:
                return("Для вашей операционной системы приложения пока нет.");
        }
    }

    public static int calculatingDeliveryDays (int dist) {
        int deliveryDays = 1;
        if (dist < 20) {
            System.out.println("Потребуется дней: ");
            return deliveryDays;
        }
        if ((dist >= 20) && (dist < 60)) {
            System.out.println("Потребуется дней: ");
            return deliveryDays*2;
        }
        if ((dist >= 60) && (dist < 100)) {
            System.out.println("Потребуется дней: ");
            return deliveryDays*3;
        }
        if (dist >= 100) {
            System.out.println("Свыше 100 км доставки нет");
            return deliveryDays*0;
        }
        return deliveryDays;
    }
}