package orden_extremo;
import java.io.File; 
import java.io.IOException;
import java.io.PrintStream;
/**
 *
 * @author benja
 */
public class CrearArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=100,lim=99; 
        try {
            PrintStream ps = new PrintStream(new File("numeros.txt"));
            for(int i=0; i<n; i++ ){ 
                ps.println((int) (Math.random()*lim)+1); 
            }
        }catch (IOException e ){ 
        System.out.println("ERROR" + e.getMessage());
        }
    }
}
