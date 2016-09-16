package kdkprojekt1_koty;

import java.util.ArrayList;
import java.util.List;

public class KotDAO {
    static List <Kot> listaKotow = new ArrayList<>();
    public static void dodajKota(Kot kot){
        listaKotow.add(kot);
    }
   public static void drukujKoty(){
       for(Kot kot:listaKotow) System.out.println(kot.przedstawSie());
   }
}
