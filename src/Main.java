public class Main {
    public static void main(String[] args) {
        System.out.println( "задание 1 ");
        int clientsOs = 0;
        if (clientsOs == 0) {
            System.out.println("Установите версию для приложения iOs по ссылке");
        }
        else if ( clientsOs ==1) {
            System.out.println( "Установите версию для приложения Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        int clientsiOs = 0;
        if (clientDeviceYear <2015 ){
            if (clientsiOs ==0) {
                System.out.println(" Установите облегченную версию  для iOs ");
            } else if ( clientsiOs ==1) {
                System.out.println(" Установите облегченную версию для Android ");
            }
            else {
                if (clientsiOs ==0) {
                    System.out.println(" Установите  версию  для iOs");
                } else if (clientsiOs ==1) {
                    System.out.println("Установите версию для Android ");
                }
                }
            System.out.println(" Заданиеи 3");
           // каждый 4 год, но не 100. И  каждый 400 является високосным
           int year =2022;
           if (year %4 ==0 && year %100 !=0 ) {
               System.out.println(" Год является високосным");
           } else if ( year % 400 ==0) {
               System.out.println("Год является високосным");
           } else {
               System.out.println("Год не является високосным ");
           }
            System.out.println("Задание 4");
           int deliveryDistance= 100;
           if (deliveryDistance<20 ){
               System.out.println("Потребуется сутки для доставки");
           } else {
               int days =1;
               int delta =( deliveryDistance-20)/40;
               days=days + delta + 1;
               System.out.println("Потребуется " + days + "дней для доставки");
           }
            System.out.println(" Задание 5");
           int monthNumber =12;
           if (monthNumber> 12) {
               System.out.println(" Такого месяца не существует");
           } else {
               switch (monthNumber) {
                   case 1 :
                       System.out.println(" зима ");
                   case 2 :
                       System.out.println(" зима ");
                       break;
                   case 3 :
                       System.out.println(" весна ");
                       break;
                   case 4:
                       System.out.println(" весна ");
                       break;
                   case 5 :
                       System.out.println(" весна ");
                       break;
                   case 6 :
                       System.out.println(" лето ");
                       break;
                   case 7 :
                       System.out.println(" лето ");
                       break;
                   case 8 :
                       System.out.println(" лето ");
                       break;
                   case 9 :
                       System.out.println(" осень ");
                       break;
                   case 10 :
                       System.out.println(" осень ");
                       break;
                   case 11 :
                       System.out.println(" осень ");
                       break;
                   case 12 :
                       System.out.println(" зима ");
               }
           }
        }

    }
}
