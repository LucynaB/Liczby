package pl.example.scanner.app;

public class Quiz {

    public static void main(String[] args) {

        MathQuiz mq = new MathQuiz();
        System.out.println("Pytanie 1:");
        boolean ans1 = mq.question1();
        mq.czyPoprawna(ans1);

        System.out.println("Pytanie 2:");
        boolean ans2 = mq.question2();
        mq.czyPoprawna(ans2);

        System.out.println("Pytanie 3:");
        boolean ans3 = mq.question3();
        mq.czyPoprawna(ans3);

        System.out.println("Twój wynik to: " + mq.getIlePopr()+"/3.");


    }
}
