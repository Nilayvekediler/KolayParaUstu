public class ParaUstu {

    public void paraUstuHesaplama(double odencekPara,double odenenPara) { //değer döndürmeyen paraUstuHesaplama metodunu işlem yapmak ve ekrana yazdırmak için oluşturdum.

        double paraustu;
        paraustu = odenenPara - odencekPara;

        if (paraustu == 0)
        {
            System.out.println("Para üstünüz yok");
        }
        else if (odencekPara>odenenPara)
        {
            System.out.println("Eksik para ödediniz.");
        }

        else
        {
            double islem,islem2,islem3,islem4,islem5,islem6,islem7,islem8,islem9,islem10,onkr,beskr;
            int ikiyuz,yuz,elli,yirmi,on,bes,bir,ellikr,yirmibeskr;

            ikiyuz = (int) (paraustu / 200); /*ikiyuz int,paraustu double,200 int türünde bir değişken olduğundan yani double
            bir sayının int sayıya bölümü int olmayacağından type casting-tip dönüşümü- yaptım. Diğer satırlarda da aynı şekilde.*/
            if (ikiyuz>0) //0 adet 200 tl veya - adet 200 tl var demek bozukluklara ve çıktıda kötü bir görüntüye sebep olduğundan if ile bunu önledim.
                System.out.print(ikiyuz + " adet 200 TL, ");

            islem = paraustu - (ikiyuz * 200);
            yuz = (int) (islem / 100);
            if (yuz>0)
                System.out.print(yuz + " adet 100 TL, ");

            islem2 = islem - (yuz * 100);
            elli = (int) (islem2 / 50);
            if (elli>0)
                System.out.print(elli + "adet 50 TL, ");

            islem3 = islem2 - (elli * 50);
            yirmi = (int) (islem3 / 20);
            if (yirmi>0)
                System.out.print(yirmi + " adet 20 TL, ");

            islem4 = islem3 - (yirmi * 20);
            on = (int) (islem4 / 10);
            if (on>0)
                System.out.print(on + " adet 10 TL, ");

            islem5 = islem4 - (on * 10);
            bes = (int) (islem5 / 5);
            if (bes>0)
                System.out.print(bes + " adet 5 TL, ");

            islem6 = islem5 - (bes * 5);
            bir = (int) (islem6 / 1);
            if (bir>0)
                System.out.print(bir + " adet 1 TL, ");

            islem7 = islem6 - (bir * 1);
            ellikr = (int) (islem7 / 0.5);
            if (ellikr>0)
                System.out.print(ellikr + " adet 50 kuruş, ");

            islem8 = islem7 - (ellikr * 0.5);
            yirmibeskr = (int) (islem8 / 0.25);
            if (yirmibeskr>0)
                System.out.print(yirmibeskr + " adet 25 kuruş, ");

            islem9 = (islem8 - (yirmibeskr * 0.25));
            onkr =(int) (islem9 / 0.09);/*sistem örneğin 12,10 - 10'un sonucunu 0,1 değil de 0.09999999999999964 döndürüyor.
            Bunun sebebi 0.1'in ikili bir kayan nokta gösteriminde tam olarak temsil edilememesidir. Bu python dilinde de böyledir.
            Bu yüzden 0.1 yerine 0.09 aldım eğer böyle almasaydım 0.09999/0.1 den yanıtımı int tip dönüşümüne de uğrayınca 0 alıyor
            ve 10 kuruş if ini atlayıp 1 10 kuruşu 1 5 kuruş olarak gösteriyordu. Fakat 0.1 yerine hassasiyete uygun olarak 0.09 alında
            sonuç doğru çıktı.*/
            if (onkr>0)
                System.out.print((int)onkr+ " adet 10 kuruş, "); //1.0 10 kuruş dememesi için tip dönüşümü yaptım.

            islem10 = islem9 - (onkr * 0.09);
            beskr = (int) (islem10 / 0.04);//Yine 10 kuruş açıklamasıyla aynı şekilde 0.05'i 0.04 aldım.
            if (beskr>0)
                System.out.print((int)beskr + " adet 5 kuruş.");




        }
    }
}
