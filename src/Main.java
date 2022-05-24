// Videodaki hesap makinesini switch-case kullanarak yapınız.
// https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner islem = new Scanner(System.in);
        double numberOne,numberTwo;
        int select;
        System.out.print("İlk sayıyı giriniz: ");
        numberOne = islem.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        numberTwo = islem.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = islem.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplam: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Çıkarma: " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Çarpma: " + (numberOne * numberTwo));
                break;
            case 4:
                if (numberTwo == 0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                else{
                    System.out.println("Bölme: " + (numberOne / numberTwo));
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz!");
        }
    }
}
