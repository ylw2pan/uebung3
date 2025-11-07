package p1;

public class P1_main {
    public static void main(String[] args) {
        // simulate a dice roll (1-6)
        int wuerfel = (int) (Math.random() * 6) + 1;
        System.out.println("Wuerfel: " + wuerfel);

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("Gewonnen");
        } else if (wuerfel == 2) {
            System.out.println("Verloren");
        } else if (wuerfel == 5) {
            System.out.println("Unentschieden");
        } else {
            System.out.println("Unklar");
        }
    }
}