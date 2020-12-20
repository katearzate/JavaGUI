package pkg3numeros;





/**
 *
 * @author Katherine Arzate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = {1,0,-4};
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= mayor)
                mayor = numeros[i];
        }
        System.out.println("El mayor es "+mayor);
    }
    
}
