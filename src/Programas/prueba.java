package Programas;
import Datos.DatosDesordenados;
import Datos.DatosOrdenados;
import javax.swing.JOptionPane;
/**
 *
 * @author isra
 */
public class prueba {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatosDesordenados m;
        //DatosOrdenados datosOrd;
        int n, s; 
        long t, t1, t2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));
        
        m = new DatosDesordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        
        t1 = System.nanoTime();   // start
            DatosOrdenados mob = m.bubbleSort();
            t2 = System.nanoTime();   // stop
            t= t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Burbuja=" + mob);
            t1 = System.nanoTime();   // start
            DatosOrdenados moi = m.insertSort();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Inserción" + moi);
    }
    
} 
