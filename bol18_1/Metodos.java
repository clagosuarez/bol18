/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bol18_1;

/**
 *
 * @author clagosuarez
 */
public class Metodos {
    int[] Numeros = new int[6];
    
    public void generarArray(){
        System.out.println("Sin invertir:");
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = (int) (Math.random()*50)+1;
            System.out.println(Numeros[i]);
        }  
    }
    public void mostrarArray(){
        System.out.println("Invertido:");
        for (int i = Numeros.length - 1; i > -1; i--) {
            System.out.println(Numeros[i]);
        }  
    }
}
