package Programas;
import Datos.DatosDesordenados;
import Datos.DatosOrdenados;
import java.util.Arrays;
/**
 *
 * @author isra
 */
public class AlgoritmoRadix { 
        static int n=1000, s=2000; 
        static long t, t1, t2;
        
    public static void main(String[] args) {
        DatosDesordenados m;
        m = new DatosDesordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        t1 = System.nanoTime();   // start
            DatosOrdenados Rs = m.radixSort();
            t2 = System.nanoTime();   // stop
            t= t2 - t1;
            System.out.println("n="+ n + "\ntiempo =" + t + "\nns.=RadixSort" + Rs);
    }
}
