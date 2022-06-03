package Programas;
import java.io.File;
import orden_extremo.MezclaDirecta;
/**
 *
 * @author isra
 */
public class PruebaMexclaDirecta {
    public static void main(String[] args) {
        MezclaDirecta md = new MezclaDirecta(); 
        md.mezclaDirecta(new File("numeros.txt"), 100);
    }
}
