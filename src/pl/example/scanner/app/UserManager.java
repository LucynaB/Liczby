package pl.example.scanner.app;


import java.util.Scanner;

import pl.example.scanner.data.User;

public class UserManager {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();

        User user = new User(imie, nazwisko, pesel, wiek);
        System.out.println(user.getImie() + " " + user.getNazwisko() + " " + user.getPesel() + " " + user.getWiek());
    }

}
