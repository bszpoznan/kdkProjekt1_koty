/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdkprojekt1_koty;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dom
 */
public class KdkProjekt1_koty {

    /**
     * @param args the command line arguments
     */
    
    static  Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        Kot kot1 = new Kot();
        kot1.setImie("Mruczek");
        kot1.setImieOpiekuna ("Opiekun1");
        kot1.setData("2016.01.01");
        System.out.println(kot1.przedstawSie());
        System.out.println("______________________");
        Kot kot2 = new Kot();
        System.out.print("Podaj imię kota: ");
        kot2.setImie(getUserInput());
        System.out.print("Podaj imię opiekuna: ");
        kot2.setImieOpiekuna (getUserInput());
        System.out.print("Podaj wage: ");
        kot2.setWaga (Double.valueOf(getUserInput()));
        kot2.setData(getUserInput());
        
      
        
    }
    
   public static String getUserInput(){
       return sc.nextLine();
   }
}
