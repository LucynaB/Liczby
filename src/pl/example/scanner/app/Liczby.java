package pl.example.scanner.app;

public class Liczby {


    double greatest(double liczba1, double liczba2, double liczba3){
        if (liczba1 > liczba2 && liczba1 > liczba3) {
            return liczba1;
        }else if (liczba2 > liczba1 && liczba2>liczba3){
            return liczba2;
        }else return liczba3;

    }

    double least(double liczba1, double liczba2, double liczba3){
        if (liczba1 < liczba2 && liczba1 < liczba3) {
            return liczba1;
        }else if (liczba2 < liczba1 && liczba2<liczba3){
            return liczba2;
        }else return liczba3;
    }

    double avergage(double liczba1, double liczba2, double liczba3){
       return (liczba1 + liczba2 + liczba3) / 3;
    }
}
