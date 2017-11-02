package lab7.kumeler;

import java.util.ArrayList;

public class Lab7Kumeler {

    public static void main(String[] args) {
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);

   

        System.out.print("km ={ ");
        km.yazdir();
        System.out.println("}");
        
        int[] a={1,2,3,4,5,6};
        kume km2=new kume(a);
        System.out.print("km2 ={ ");
        km2.yazdir();
        System.out.println("}");
        
        kume km3=new kume(a);
        System.out.print("km2 ={ ");
        km3.yazdir();
        System.out.println("}");
        
        if(km.denk(km2))
            System.out.println("km ve km2 kumeleri denktir.");
        else System.out.println("km ve km2 kumeleri denk degildir.");
        
        if(km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esittir.");
        else System.out.println("km2 ve km3 kumeleri esit degidir.");
        /*
       kume sn=km.birlesim(km2);
        System.out.print("km ve km2 birlesimi ={ ");
        sn.yazdir();
        System.out.println("}");
       
        kume sn2=km.kesisim(km2);
        System.out.print("km ve km2 kesisimi ={ ");
        sn2.yazdir();
        System.out.println("}");
        
        
        
        kume sn3=km.fark(km2);
        System.out.print("km ve km2 farki ={");
        sn3.yazdir();
        System.out.println("}");*/
        
       /* System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc=km.altKumeler();
        for(int i=0;i<sonuc.size();i++){
        System.out.print("km ve km2 farki ={");
        sonuc.get(i).yazdir;
        System.out.println("}");
        }
*/
    }
}
