package Datos;
/**
 *
 * @author isra
 */
public class DatosOrdenados {
   private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    } 
    public int[] getCopiaValores(){
        int x=valores.length;
        int [] copia = new int[x];
        System.arraycopy(valores, 0, copia, 0, x);
        return copia;
    }
    public int minimo() {
        return valores[0];
    }

    public int maximo() {
        int max=valores[0];
        for(int i=0;i<valores.length;i++){
            if(valores[i]>max)
                max=valores[i];
        }
        return max;
    }
    int ciclos=0; //lo quitas
    
    public int busquedaSecuencial(int clave) {
        for(int i=0; i<valores.length && valores[i]<=clave ;i++){
            if(clave==valores[i]){
                ciclos=i; // lo quitas
                return i;
            }
            ciclos=i; // lo quitas
        }
        return -1;
    }

    public int busquedaBinaria(int clave) {
        int bajo=0, alto=valores.length;
        int central=(bajo+alto)/2;
        ciclos=0;    // lo quitas
        while(bajo<alto && clave!=valores[central]){
            if(clave < valores[central]){
                alto=central-1;
            }else{
                bajo=central+1;
            }
            central=(bajo+alto)/2;
            ciclos++;     // lo quitas
        }
        if(clave==valores[central]){
            return central;
        }
        
        return -1;
    }
    
    // lo quitas el metodo 
    public String ciclosBS(){
        return "\tciclos=  "+ciclos;
    }
}
