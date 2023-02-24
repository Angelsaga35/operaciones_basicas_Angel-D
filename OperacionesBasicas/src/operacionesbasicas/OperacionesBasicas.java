
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones basicas :
 * suma, resta, multiplicacion y division.
 * 
 */

public class OperacionesBasicas {
    
   // int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicacion, division;

    public void suma(int valor1, int valor2){
        
        //Reliza el calculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }
    
    public void resta(int valor1, int valor2){
        //Reliza el calculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }  
    
    public void multiplicacion(int valor1, int valor2){
        //Reliza el calculo de la multiplicacion
        multiplicacion = valor1 * valor2;
        System.out.println("La multiplicacion es: " + multiplicacion);
    }

    public void division(int valor1, int valor2){
        //Reliza el calculo de la division
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.suma (8,5);
        operaciones.resta (16,9);
        operaciones.multiplicacion(10,20);
        operaciones.division (6,2);
        
    }
}