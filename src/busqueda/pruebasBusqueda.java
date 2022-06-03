package busqueda;
import Datos.DatosDesordenados;
import Datos.DatosOrdenados;
import javax.swing.JOptionPane;
/**
 * @author benja
 */
public class pruebasBusqueda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lim=1000;
        int n=20;
        DatosDesordenados datos= new DatosDesordenados(lim,n);
        datos.generarValores();
        System.out.println("DesOrdenados ---> "+ datos);
        int clave=Integer.parseInt(JOptionPane.showInputDialog("¿Que dato desea buscar?"));
        int menor1=datos.minimo(),mayor1=datos.maximo();
        
        DatosOrdenados datosOr= datos.mergeSort();
        System.out.println("Ordenados ---> "+ datosOr);
        int menor=datosOr.minimo(),mayor=datosOr.maximo();
         
        // todo esto lo cambias a como nos lo enseño la profa
        System.out.println("\nDesOrdenados\n--> "
            + "Menor="+menor1+"\tPosicion= "+datos.busquedaSecuencial(menor1)+datos.ciclosBS()
            +"\n--> Mayor="+mayor1+"\tPosicion= "+datos.busquedaSecuencial(mayor1)+datos.ciclosBS()
            +"\n--> Clave="+clave+"\tPosicion= "+datos.busquedaSecuencial(clave)+datos.ciclosBS()
            +"\n-->(No existente en lista)Numero="+(clave+10)+"\tPosicion= "+datos.busquedaSecuencial(clave+10)
                +datosOr.ciclosBS());
        System.out.println("\nOrdenados\n--> "
            + "Menor="+menor+"\tPosicion= "+datosOr.busquedaSecuencial(menor)+datosOr.ciclosBS()
            +"\n--> Mayor="+mayor+"\tPosicion= "+datosOr.busquedaSecuencial(mayor)+datosOr.ciclosBS()
            +"\n--> Clave="+clave+"\tPosicion= "+datosOr.busquedaSecuencial(clave)+datosOr.ciclosBS()
            +"\n-->(No existente en lista)Numero="+(clave+10)+"\tPosicion= "+datosOr.busquedaSecuencial(clave+10)
                +datosOr.ciclosBS());
        System.out.println("\nOrdenados\n--> "
            + "Menor="+menor+"\tPosicion= "+datosOr.busquedaBinaria(menor)+datosOr.ciclosBS()
            +"\n--> Mayor="+mayor+"\tPosicion= "+datosOr.busquedaBinaria(mayor)+datosOr.ciclosBS()
            +"\n--> Clave="+clave+"\tPosicion= "+datosOr.busquedaBinaria(clave)+datosOr.ciclosBS()
            +"\n-->(No existente en lista)Numero="+(clave+10)+"\tPosicion= "+datosOr.busquedaBinaria(clave+10)
                +datosOr.ciclosBS());
    } 
}
