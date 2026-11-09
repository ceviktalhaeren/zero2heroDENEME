

package com.mycompany.denemesinavi;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class DenemeSINAVI {

    public static void main(String[] args) {
        System.out.println("TEC yayinlari deneme sinavi net hesaplama programina hosgeldiniz!");
        Scanner sc = new Scanner(System.in);
        System.out.println("20 soruluk deneme sinavimizda yaptiginiz dogru sayisi?");
        int dsay= sc.nextInt();
        System.out.println("20 soruluk deneme sinavimizda yaptiginiz yanlis sayisi?");
        int ysay = sc.nextInt();
        // hata kontrolü
        if (dsay>20 || dsay<0 || ysay>20 || ysay<0 || (dsay+ysay>20)){
            System.out.println("HATA!!!! ");
           
        } else   {
            // boş sayısı
            int bos = 20-(dsay+ysay);
            System.out.println("bos sayiniz" + bos  );
            
            // net hesaplama
           
            
            double net = dsay -( ysay/4.0);
            System.out.println("net sayiniz" + net  );
            // basarı durumu
            if (net>15) {
                System.out.println("gayet iyi bir sonuc netiniz 15 den fazla");
            } else if  (net>=10 && net<=15 ){
                System.out.println("ortalama bir sonuc netiniz 10 ile 15 arasinda");
            }else {
                System.out.println("netiniz 10dan dusuktur daha iyi sonuclar icin ugrasmalisin");
            }
                   
           
        }
     
    }
}
