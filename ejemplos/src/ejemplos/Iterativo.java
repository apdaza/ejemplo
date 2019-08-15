/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Iterativo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero=0;
        System.out.println("¿Que tabla quiere consultar?");
        System.out.print("Número: ");
        numero=leer.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
            
        }
        
    }
    
    

    

