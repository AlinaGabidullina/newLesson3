public class Main {
    public static void main(String[] args) {
        System.out.println( "������� 1 ");
        int clientsOs = 0;
        if (clientsOs == 0) {
            System.out.println("���������� ������ ��� ���������� iOs �� ������");
        }
        else if ( clientsOs ==1) {
            System.out.println( "���������� ������ ��� ���������� Android �� ������");
        }
        System.out.println("������� 2");
        int clientDeviceYear = 2012;
        int clientsiOs = 0;
        if (clientDeviceYear <2015 ){
            if (clientsiOs ==0) {
                System.out.println(" ���������� ����������� ������  ��� iOs ");
            } else if ( clientsiOs ==1) {
                System.out.println(" ���������� ����������� ������ ��� Android ");
            }
            else {
                if (clientsiOs ==0) {
                    System.out.println(" ����������  ������  ��� iOs");
                } else if (clientsiOs ==1) {
                    System.out.println("���������� ������ ��� Android ");
                }
                }
            System.out.println(" �������� 3");
           // ������ 4 ���, �� �� 100. �  ������ 400 �������� ����������
           int year =2022;
           if (year %4 ==0 && year %100 !=0 ) {
               System.out.println(" ��� �������� ����������");
           } else if ( year % 400 ==0) {
               System.out.println("��� �������� ����������");
           } else {
               System.out.println("��� �� �������� ���������� ");
           }
            System.out.println("������� 4");
           int deliveryDistance= 100;
           if (deliveryDistance<20 ){
               System.out.println("����������� ����� ��� ��������");
           } else {
               int days =1;
               int delta =( deliveryDistance-20)/40;
               days=days + delta + 1;
               System.out.println("����������� " + days + "���� ��� ��������");
           }
            System.out.println(" ������� 5");
           int monthNumber =12;
           if (monthNumber> 12) {
               System.out.println(" ������ ������ �� ����������");
           } else {
               switch (monthNumber) {
                   case 1 :
                       System.out.println(" ���� ");
                   case 2 :
                       System.out.println(" ���� ");
                       break;
                   case 3 :
                       System.out.println(" ����� ");
                       break;
                   case 4:
                       System.out.println(" ����� ");
                       break;
                   case 5 :
                       System.out.println(" ����� ");
                       break;
                   case 6 :
                       System.out.println(" ���� ");
                       break;
                   case 7 :
                       System.out.println(" ���� ");
                       break;
                   case 8 :
                       System.out.println(" ���� ");
                       break;
                   case 9 :
                       System.out.println(" ����� ");
                       break;
                   case 10 :
                       System.out.println(" ����� ");
                       break;
                   case 11 :
                       System.out.println(" ����� ");
                       break;
                   case 12 :
                       System.out.println(" ���� ");
               }
           }
        }

    }
}
