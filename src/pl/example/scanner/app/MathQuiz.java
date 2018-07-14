package pl.example.scanner.app;

import java.util.Scanner;

public class MathQuiz {

    Scanner scanner = new Scanner(System.in);
    private int ilePopr = 0;

    boolean question1() {

        System.out.println("Jaki jest wynik mnożenia 3*5?");

        int answer = scanner.nextInt();

        if (answer == 3 * 5) {
            ilePopr ++;
            return true;
        } else
            return false;
    }

    boolean question2() {

        System.out.println("Jakie jest pole kwadratu o boku 12?");

        int answer = scanner.nextInt();

        if (answer == 12 * 12) {
            ilePopr ++;
            return true;
        } else
            return false;
    }

    boolean question3() {

        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        int answer = scanner.nextInt();

        if (answer == 123) {
            ilePopr ++;
            return true;
        } else
            return false;
    }

    public int getIlePopr() {
        return ilePopr;
    }

    void czyPoprawna(boolean ans){
        if(ans){
            System.out.println("Odpowiedź poprawna.");
        }else
            System.out.println("Odpowiedź niepoprawna.");
    }
}
