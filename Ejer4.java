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
public class Ejer4 {
    public static void main (String[] args){
        int a=0,n,ob=0,par;
        double precio,totc,des,s;
        Scanner teclado =new Scanner(System.in);
        for(int j=1;j<=10;j++){
        System.out.println("Ingrese la cantidad de docenas:");
        n=teclado.nextInt();
        System.out.println("Ingrese el precio:");
        precio=teclado.nextDouble();
        if(n==3){
            s=n*precio;
            des=s*0.15;
            totc =s-des;
            
        }
        else{
            s=n*precio;
            des=s*0.10;
            totc =s-des;
            for(int i=4;i<=n;i++){
            if(n>3){
                ++ob;
            }
            }
            a=n+ob;
        }
        System.out.println("total de compra es: "+totc);
        System.out.println("descuento: "+des);
        System.out.println("unidades de regalo: "+ob);
    }
    }
    
}
