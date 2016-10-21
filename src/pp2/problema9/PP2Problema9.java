/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema9;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String dato;    // Declaracion de variables
    
    dato = pedirDato();     //Declaracion de metodos
    mostrarResultados(dato);
    
    }
    
    public static String pedirDato() {  //Metodo para pedir dato por teclado, utiliza un dato string
        String dato;
        Scanner entrada= new Scanner(System.in); 
        System.out.println("Introducir número");
        dato= entrada.next();
        return dato;
    }
    
    public static void mostrarResultados(String d){         //Metodo que muestra el resultado de la conversión, el proceso de conversión se realiza
        String var = d;                                     // dentro de este mismo metodo a través de un for
        char cad [];
        
        cad = var.toCharArray();
        int length = cad.length-1;
        
    for ( int  i=length; i>=0;--i){
            int ceros;
            ceros = (int) (Math.pow(10,(cad.length-1)-i));
            
            int x;
            x = Integer.parseInt(String.valueOf(cad[i]));
    
            System.out.println(x*ceros);

    }}}

