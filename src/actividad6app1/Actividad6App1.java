
package actividad6app1;
import java.util.Scanner;
import java.io.Console;
/**
 *
 * @author Paul Francisco Granados Ojeda
 * Computacion en Java
 * Matricula 2821934
 */
public class Actividad6App1 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    
    float cal1;
    float cal2;
    float cal3;
    float cal4;
    float cal5;
    float promedio;
    String Nombre;
    
    
    System.out.println("¿Cuál es tu nombre completo?:");
    Nombre=reader.nextLine( );
    System.out.println("Introduce la primera calificacion:");			
    cal1 = reader.nextFloat();	
    System.out.println("Introduce la segunda calificacion:");
    cal2 = reader.nextFloat();
    System.out.println("Introduce la tercera calificacion:");			
    cal3 = reader.nextFloat();
    System.out.println("Introduce la cuarta calificacion:");
    cal4 = reader.nextFloat();
    System.out.println("Introduce la quinta calificacion:");			
    cal5 = reader.nextFloat();

    promedio =  (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
    
    System.out.println("El alumno: " +Nombre);
    System.out.println("Obtuvo un promedio de : " +promedio);
    
    if (promedio <= 50)
    System.out.println("Nota: F");
    if (promedio > 50 && promedio <61)
    System.out.println("Nota: E");
    if (promedio > 60 && promedio <71)
    System.out.println("Nota: D");   
    if (promedio > 70 && promedio <81)
    System.out.println("Nota: C");
    if (promedio > 80 && promedio <91)
    System.out.println("Nota: B"); 
    if (promedio > 90 && promedio <101)
    System.out.println("Nota: A");   
      
}   
}
