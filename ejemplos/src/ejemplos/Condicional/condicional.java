/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.Condicional;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class condicional {
     public static void main(String[] args) {
         int numero = 0;
         System.out.println("Digite un numero para saber si es negativo o positivo");
         System.out.println("Número: ");
         Scanner leer = new Scanner(System.in);
         numero= leer.nextInt();
          if (numero == 0) {
             System.out.println(numero+" no tiene signo");
         }else{
              if(numero > 0){
                  System.out.println(numero+" es positivo");
              }else{
                  System.out.println(numero+" es negativo");
              }
          }
         
     }
    
}
