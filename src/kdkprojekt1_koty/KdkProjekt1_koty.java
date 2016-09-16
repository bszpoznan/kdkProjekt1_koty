package kdkprojekt1_koty;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KdkProjekt1_koty {

    
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
        
        Pattern pattern = Pattern.compile("[0-9]+(.[0-9]+)?");
        Matcher matcher;
        String tempWaga;
        do{
            System.out.print("Podaj wage kota: ");
            tempWaga = getUserInput();
            matcher = pattern.matcher(tempWaga);
        }while (!matcher.matches());
               
        kot2.setWaga (Double.valueOf(tempWaga));
        
        pattern = Pattern.compile("[0-9]{4}.[0-1]?[0-9].[0-3]?[0-9]");
        String tempDataUrodzenia; 
        do{ 
            System.out.print("Data urodzenia kota w formacie RRRR.MM.DD: ");
            tempDataUrodzenia =getUserInput();
            matcher = pattern.matcher(tempDataUrodzenia);
        }while (!matcher.matches());
              
        kot2.setData(tempDataUrodzenia);
        System.out.println(kot2.przedstawSie());
        
      
        
    }
    
   public static String getUserInput(){
       return sc.nextLine();
   }
}
