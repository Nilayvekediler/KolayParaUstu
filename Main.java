import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("****************************************Kolay para üstü uygulamasına hoş geldiniz!****************************************");

        double odenecekTutar, odemeTutari;

        Scanner klavye = new Scanner(System.in);

        System.out.println("Ödenecek tutarı giriniz:");
        odenecekTutar = klavye.nextDouble();

        System.out.println("Ödeme için verilen tutarı giriniz:");
        odemeTutari = klavye.nextDouble();
        //Yukarıda kullanıcıdan ödenecek tutar ve ödeme tutarı bilgileri alınıp tanımlanmış değişkenlere atandı.

        ParaUstu paraUstu = new ParaUstu();//paraUstu sınıfının metotlarından yararlanabilmek için paraUstu nesnesini oluşturduk.
        //paraUstu nesne değişkeninin içine ParaUstu sınıfının referans bilgisi aktarıldı.

        paraUstu.paraUstuHesaplama(odenecekTutar, odemeTutari);//paraUstu sınıfının paraUstuHesaplama metotuna parametreler girilerek çağırıldı.


    }


}

