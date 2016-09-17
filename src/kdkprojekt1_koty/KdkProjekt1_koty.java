package kdkprojekt1_koty;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KdkProjekt1_koty {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String wybor;
        do {
            printMenu();
            wybor =getUserInput();
            if (wybor.equals("1")) {
                dodajKota();
            }
            if (wybor.equals("2")) {
                KotDAO.drukujKoty();
            }
        } while (wybor.equals("1") || wybor.equals("2"));

    }

    public static String getUserInput() {
        return sc.nextLine();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("****************************MENU****************************");
        System.out.println("************************************************************");
        System.out.println();
        System.out.println("  Wybierz:");
        System.out.println("1. Dodaj kota");
        System.out.println("2. Wyświetl listę kotów");
        System.out.println("x. Zakończ program");

    }

    public static void dodajKota() {
        Kot kot = new Kot();
        System.out.print("Podaj imię kota: ");
        kot.setImie(getUserInput());
        System.out.print("Podaj imię opiekuna: ");
        kot.setImieOpiekuna(getUserInput());

        Pattern pattern = Pattern.compile("[0-9]+(.[0-9]+)?");
        Matcher matcher;
        String tempWaga;
        do {
            System.out.print("Podaj wage kota: ");
            tempWaga = getUserInput();
            matcher = pattern.matcher(tempWaga);
        } while (!matcher.matches());

        kot.setWaga(Double.valueOf(tempWaga));

        pattern = Pattern.compile("[0-9]{4}.[0-1]?[0-9].[0-3]?[0-9]");
        String tempDataUrodzenia;
        do {
            System.out.print("Data urodzenia kota w formacie RRRR.MM.DD: ");
            tempDataUrodzenia = getUserInput();
            matcher = pattern.matcher(tempDataUrodzenia);
        } while (!matcher.matches());

        kot.setData(tempDataUrodzenia);

        KotDAO.dodajKota(kot);
    }
}
