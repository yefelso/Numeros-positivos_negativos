/*Desarrolle un algoritmo que me diga que el numero ingrasado es positivo o negativo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.positivo_negativo;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class NumeroPositivo_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
         System.out.println("ingrese su nombre");
         String nombre = sc.nextLine();
         System.out.println("Hola"+nombre);
        
        System.out.println("Por favor ingrese un numero:");
        int numero = sc.nextInt();
        
        if(numero<0) {
            System.out.println("Hola"+ nombre);
            System.out.println("El numero que ingreso es un numero negativo");
}       else if(numero == 0) {
            System.out.println("Hola"+ nombre);
            System.out.println("El numero que ingreso es un numero neutro");
}       
        else{
            System.out.println("Hola"+ nombre);
            System.out.println("El numero que ingreso es un numero positivo");
}
    }
    
}
