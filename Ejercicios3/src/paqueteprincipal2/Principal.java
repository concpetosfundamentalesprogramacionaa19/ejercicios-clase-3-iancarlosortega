/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;

import paquetedatos. *;

/**
 *
 * @author Salas
 */
public class Principal {
    
    public static void main(String[] args){
        //Metodo principal
        double resultado;
        resultado = Variable.numero1 + Variable.numero2;
        
        System.out.printf("La suma del numero 1 y 2 es : %.1f", resultado);
        
        double resultado2;
        resultado2 = Variable.numero1 + Variable2.numero3;
        
        System.out.printf("\nLa suma del numero 1 y 3 es : %.1f\n",resultado2);
    }
}
