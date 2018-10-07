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
public class Ejer2 {
    public static void main(String []args){
        int n = 2;
        int suma = 0;
        String cnt = "a";

        while (n <=1800){
        suma = suma + n; 
        System.out.println(n);
        //Se compara la variable  
        if( "a".equals(cnt)){
            n = n + 3;
            cnt = "b";
        } else {
            n = n +2;
            cnt = "a";
        }
        }
        System.out.println("suma: "+suma);
    }
}
