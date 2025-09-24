
package programas;

/**
 *
 * @author lleck
 */
import java.util.Scanner;
public class Operaciones {
    public static void main(String[]args){
    int n1, n2, suma,resta;
    Scanner lectura=new Scanner(System.in);
    //entrada 
    System.out.print("Ingresar numero 1:");
    n1=lectura.nextInt();
    System.out.print("Ingresar numero 2:");
    n2=lectura.nextInt();
    //proceso
    suma=n1+n2;
    resta=n1-n2;
    //salida
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    
    
    
            
    
    
    
    
    }
}
