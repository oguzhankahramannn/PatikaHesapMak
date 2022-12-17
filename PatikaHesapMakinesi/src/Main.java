import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,seciminiz;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Sayiyi giriniz : ");
        sayi1 = scan.nextInt();
        System.out.println("İkinci Sayiyi giriniz : ");
        sayi2 = scan.nextInt();
        System.out.println("Yapacağınız işlemi seçiniz : \n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Seçiminiz : ");
        seciminiz = scan.nextInt();
        switch (seciminiz){
            case 1:
                System.out.println("Toplama: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Bölme: "+ (sayi1/sayi2));
                break;
            case 4:
                System.out.println("Çarpma: "+ (sayi1*sayi2));
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz");
                break;
        }




    }
}