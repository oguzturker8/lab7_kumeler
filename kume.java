package lab7.kumeler;
import java.lang.*;
import java.util.ArrayList;

public class kume {

    private ArrayList<Integer> elemanlar;

    public kume() {
         elemanlar = new ArrayList<>();
    }

    public kume(int[] a) {
        elemanlar=new ArrayList<>();
        for(int i=0;i<a.length;i++)
            elemanlar.add(a[i]);
    }

    public kume(kume a) {
        elemanlar=new ArrayList<>();
        for (int i = 0; i < a.elemanlar.size(); i++) {
            this.elemanlar.add(a.elemanlar.get(i));
        }
    }

    public void ekle(int a) {
        elemanlar.add(a);
    }

    public void yazdir() {
        for (int i = 0; i < elemanlar.size(); i++) {
            System.out.print(elemanlar.get(i) + " ");
        }
    }

    public boolean denk(kume a) {
        int r = elemanlar.size(), k = a.elemanlar.size();
        if (r == k) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esit(kume a) {
        int s = 0;
        for (int i = 0; i < elemanlar.size(); i++) {
            for (int j = 0; j < a.elemanlar.size(); j++) {
                if (elemanlar.get(i) == a.elemanlar.get(j)) {
                    s++;
                }
            }
        }
        return s == elemanlar.size();
    }

  public kume birlesim(kume a) {
       kume birlesim1 = new kume(a);
       kume birlesim2 = new kume();
       for(int i=0;i<this.elemanlar.size();i++)
       birlesim2.ekle(this.elemanlar.get(i));
       
       for(int i=0;i<birlesim2.elemanlar.size();i++){
           birlesim1.ekle(birlesim2.elemanlar.get(i));
       }
       for(int i=0;i<birlesim1.elemanlar.size()-1;i++){
           for(int j=i+1;j<birlesim1.elemanlar.size();j++){
               if(birlesim1.elemanlar.get(i)==birlesim1.elemanlar.get(j)){
                   birlesim1.elemanlar.remove(j);
               }
           }
       }      
    return birlesim1;  
  }
  
    public kume kesisim(kume a) {
       kume kesisim1 = new kume(a);
       kume kesisim2 = new kume();
       kume kesisim3 = new kume();
       for(int i=0;i<elemanlar.size();i++)
       kesisim2.ekle(elemanlar.get(i));
       
        for(int i=0;i<kesisim2.elemanlar.size();i++){
            for(int j=0;j<kesisim1.elemanlar.size();j++){
                if(kesisim2.elemanlar.get(i)==kesisim1.elemanlar.get(j)){
                   kesisim3.ekle(kesisim2.elemanlar.get(i));
                }
            }
        }       
        return kesisim3;
    }

     public kume fark(kume a) {
       kume fark1 = new kume();
       kume fark2 = new kume(a);
       for(int i=0;i<this.elemanlar.size();i++)
       fark1.ekle(this.elemanlar.get(i));
       
      for(int i=0;i<fark1.elemanlar.size();i++){
           for(int j=0;j<fark2.elemanlar.size();j++){
               if(fark1.elemanlar.get(i)==fark2.elemanlar.get(j))//Sorunlu if
                   fark1.elemanlar.remove(i);
           }
       }
       
        return fark1;
    }

     public ArrayList<kume> altKumeler(){
         int n=(int) Math.pow(2,elemanlar.size());
         
         ArrayList<kume> altkume=new ArrayList <>();
         kume a1=new kume();
         kume a2=new kume();
         kume a3=new kume();
         kume a4=new kume();
         kume a5=new kume();
         kume a6=new kume();
         kume a7=new kume();
         System.out.println("Sadece 3 elemanlı kumelerin altkumesi bulunabiliyor");
         System.out.println("Alt Kume Sayisi = "+n);
         System.out.println("={}");
         
             a1.ekle(elemanlar.get(0));
             a2.ekle(elemanlar.get(1));
             a3.ekle(elemanlar.get(2));
             for(int i=0;i<elemanlar.size()-1;i++)
                 a4.ekle(elemanlar.get(i));
             for(int i=1;i<elemanlar.size();i++)
                 a5.ekle(elemanlar.get(i));  
             for(int i=0;i<elemanlar.size();i++){
                 if(i!=0)
                     i++;
                 if(i>2)
                     break;
                 a6.ekle(elemanlar.get(i));
             }
             for(int i=0;i<elemanlar.size();i++)
                 a7.ekle(elemanlar.get(i));
             
         altkume.add(a1);
         altkume.add(a2);
         altkume.add(a3);
         altkume.add(a4);
         altkume.add(a5);
         altkume.add(a6);
         altkume.add(a7);
         return altkume ;
     
     }}

