/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tar3;

import java.io.*;
import java.util.*;
/**
 *
 * @author home
 */
public class Ejer1 {
   
    public static void main(String []args) {
        int i=3;
      int a[]= new int[i];
        
      
      Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        a[0]= teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        a[1]= teclado.nextInt();
        System.out.println("ingrese el tercer numero");
        a[2]= teclado.nextInt();
        
        for(i=2;i>=0;i--){
             
            System.out.println("Numero " + a[i]);
        }  
        
    }
}
