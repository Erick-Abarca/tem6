package orden_extremo;
import java.io.File; 
import java.io.IOException; 
import java.io.PrintStream; 
import java.util.Scanner; 
/**
 *
 * @author isra
 */
public class MezclaDirecta {
    public void mezclaDirecta(File f, int n){
        File f1 = new File("f1.txt"); 
        File f2 = new File("f2.txt"); 
        int particion = 1; 
        particiona(f, f1, f2, particion); 
        fusiona(f, f1, f2, particion); 
        while (particion < ((n + 1)/2) ){
            particion*=2; 
            particiona(f, f1, f2, particion); 
            fusiona(f, f1, f2, particion); 
        }
    }

    private void particiona(File f, File f1, File f2, int particion) {
        try {
            // Abrir el archivo f para lectura y F1, F2 para escritura 
            Scanner F = new Scanner(f);
            PrintStream Fl = new PrintStream(f1);
            PrintStream F2 = new PrintStream(f2);
            while (F.hasNext()) {
                int k = 0;
                while ((k < particion) && F.hasNext()) {
                    String R = F.next();
                    Fl.println(R);
                    k++;
                }
                int i = 0;
                while ((i < particion) && F.hasNext()) {
                    String R = F.next();
                    F2.println(R);
                    i++;
                }
            }
            Fl.close();
            F2.close();
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
    private void fusiona(File f, File f1, File f2, int particion){
        try{ 
            PrintStream F = new PrintStream(f); 
            Scanner F1 = new Scanner(f1); 
            Scanner F2 = new Scanner(f2);
            String R1=""; 
            String R2=""; 
            boolean B1=true; 
            boolean B2=true; 
            if (F1.hasNext()){ 
               R1=F1.next();
               B1=false;  
            }if (F2.hasNext()){
                R2=F2.next(); 
                B2=false; 
            }
            int k=0; 
            int i=0; 
            while((F1.hasNext() || B1==false)&&(F2.hasNext() ||
                    B2==false)){ 
                
               //while((k<particion && B1==false) && (i<particion)&&
                   //     B2==false){
                    int n1 = Integer.parseInt(R1); 
                    int n2 = Integer.parseInt(R2); 
                    if (n1 < n2){ 
                       F.println(R1); 
                       B1=true;
                        k++; 
                        if (F1.hasNext()){ 
                            R1 = F1.next(); 
                            B1 = false; 
                        }
                    }else{
                        F.println(R2); 
                        B2=true;
                        i++;
                        if(F2.hasNext()){
                            R2 = F2.next(); 
                            B2 = false; 
                        }
                    }
                
                while((k<particion)&& B1==false){
                   F.println(R1); 
                   B1=true;
                   k++; 
                   if(F1.hasNext()){
                      R1=F1.next(); 
                      B1=false;  
                   }
                }
                while((i<particion) && B2==false){
                    F.println(R2); 
                    B2=true;
                    i++;
                    if(F2.hasNext() ){
                        R2=F2.next(); 
                        B2=false; 
                    }
                }
            }
            if (B1==false){ 
                F.println(R1);
            } 
            if(B2==false){ 
                F.println(R2);
            } 
            while(F1.hasNext()){
                R1=F1.next(); 
                F.println(R1);
            } 
            while(F2.hasNext()){
                R2=F2.next(); 
                F.println(R2);
            }
            F.close();
        }catch (Exception e){
            System.out.println("ERROR al leer el archivo"); 
        }
    }
}
