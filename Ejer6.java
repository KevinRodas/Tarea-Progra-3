/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tar3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author home
 */ 

public class Ejer6 {
static Class_ejer6 tmp;
static Class_ejer6 tmp_ant;
static Class_ejer6 tmpa;
static Class_ejer6 tmp_anta;
static Class_ejer6 ptmp;
static Class_ejer6 ptmp_ant;
static Class_ejer6 ptmpa;
static Class_ejer6 ptmp_anta;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList< Class_ejer6> elementos = new ArrayList();
        
        Scanner scan = new Scanner(System.in);
        System. out.println("Ingrese la cantidad de elemento");
        int n = scan.nextInt();
        for(int i =0; i<n;i++)
        {
        Class_ejer6 e = new  Class_ejer6();
           System. out.println("Ingrese el nombre");
           e.nombre =scan.next();
              System. out.println(" ");
              System. out.println("Ingrese la conductividad electrica");
            e.conductividad_electrica=scan.nextFloat();
                System. out.println(" ");
                System. out.println("Ingrese la concuctividad termica");
            e.conductividad_termica=scan.nextFloat();
               System. out.println(" ");
                  
           elementos.add(e);
        }
        
       tmp=elementos.get(0);
       tmp_ant=tmp;
       tmpa=elementos.get(0);
       tmp_anta=tmpa;
       ptmp=elementos.get(0);
       ptmp_ant=ptmp;
       ptmpa=elementos.get(0);
       ptmp_anta=ptmpa;

       elementos.forEach(item -> {
           if(item.conductividad_electrica> tmp.conductividad_electrica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       elementos.forEach(a -> {
           if(a.conductividad_termica>tmp.conductividad_termica){
              tmp_anta = tmpa;
           tmpa=a; 
           }
       });
       elementos.forEach(b -> {
           if(b.conductividad_electrica< tmp.conductividad_electrica){
           ptmp_ant = ptmp;
           ptmp=b;
           }
       });
       elementos.forEach(c -> {
           if(c.conductividad_termica<tmp.conductividad_termica){
              ptmp_anta = ptmpa;
           ptmpa=c; 
           }
       });
        System.out.println(tmp.nombre+" es primera conductividad electrica mayor: "+tmp.conductividad_electrica);
        System.out.println(tmp_ant.nombre+" es segunda conductividad electrica mayor: "+tmp_ant.conductividad_electrica);
        System.out.println(tmpa.nombre+" es primera conductividad termica mayor: "+tmpa.conductividad_termica);
        System.out.println(tmp_anta.nombre+" es segunda conductividad termica mayor: "+tmp_anta.conductividad_termica);
        System.out.println("");
        System.out.println(ptmp.nombre+" es primera conductividad electrica menor: "+ptmp.conductividad_electrica);
        System.out.println(ptmp_ant.nombre+" es segunda conductividad electrica menor: "+ptmp_ant.conductividad_electrica);
        System.out.println(ptmpa.nombre+" es primera conductividad termica menor: "+ptmpa.conductividad_termica);
        System.out.println(ptmp_anta.nombre+" es segunda conductividad termica menor: "+ptmp_anta.conductividad_termica);
    }
    
}
