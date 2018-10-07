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
public class Ejer5 {
    public static void main (String[] args){
        int kil;
        double ex=0,tot=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su el numero de kilometros recocorridos");
        kil=teclado.nextInt();
        if(kil>=300 && kil<=1000){
            ex =(kil-300)*0.15;
            tot =ex+30;
        }
        if(kil>1000){
            ex= (kil-1000)*0.10;
            tot= ex+30;
        }
        System.out.println("Total a pagar: "+tot);
        
    }
    
}
