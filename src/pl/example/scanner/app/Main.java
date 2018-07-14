package pl.example.scanner.app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // obiekt do odczytu danych
        scanner.useLocale(Locale.US); //separator .
//       System.out.println("Podaj wiek");
//       int wiek = scanner.nextInt(); //wczytanie danych i przypisanie wartości int
//        scanner.nextLine();//"zjada" enter przy przemiennym wprowadzniu int i String
//       System.out.println("Podany wiek: " + wiek);
//
//        System.out.println("Podaj liczbę");
//        double liczba  = scanner.nextDouble();
//        System.out.println(liczba);

//        System.out.println("Podaj imię");
//        String imie = scanner.nextLine();
//        System.out.println(imie);



        Liczby liczby  = new Liczby();
        System.out.println("Liczba 1: ");
        double liczba1= scanner.nextDouble();
        System.out.println("Liczba 2: ");
        double liczba2 = scanner.nextDouble();
        System.out.println("Liczba 3: ");
        double liczba3 = scanner.nextDouble();
        double najwieksza = liczby.greatest(liczba1, liczba2, liczba3);
        System.out.println("Największa z podanych liczb to: " + najwieksza);
        double najmniejsza = liczby.least(liczba1, liczba2, liczba3);
        System.out.println("Najmniejsza z podanych liczb to: " + najmniejsza);
        double srednia = liczby.avergage(liczba1, liczba2, liczba3);
        System.out.println("Srednia podanych liczb to: " + srednia);

    }
}
