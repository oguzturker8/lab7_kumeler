package lab7.kumeler;
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
       this.elemanlar=a.elemanlar;
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
         int r,q;
       kume fark1 = new kume(a);
       kume fark2 = new kume();
       kume fark3 = new kume();
       for(int i=0;i<elemanlar.size();i++)
       fark2.ekle(elemanlar.get(i));
       
       for(int i=0;i<fark2.elemanlar.size();i++){
           fark3.ekle(fark2.elemanlar.get(i));
       }
        return fark3;
    }

    /* public ArrayList<kume> altKumeler(){
         kume a = new kume();
         return a;
     }
   */

  
}

