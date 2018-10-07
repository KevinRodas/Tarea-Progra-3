/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tar3;

import java.util.*;

/**
 *
 * @author home
 */
public class Ejer3 {
    public static void main(String[] args){
        double peso, altura,prop=0,proa=0;
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de la poblacion");
        n=teclado.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Ingrese el peso "+i+" en libras:");
            peso=teclado.nextDouble();
            System.out.println("Ingrese la altura "+i+" en metros:");
            altura=teclado.nextDouble();
            prop=prop+peso;
            proa=proa+altura;
        }
        System.out.println("El promedio de el peso es: "+prop/n);
        System.out.println("El promedio de la altura es: "+proa/n);
    }
    
}
