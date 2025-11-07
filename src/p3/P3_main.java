package p3;

public class P3_main {
    public static void main(String[] args){
        int zahl = 2;
        int betrag = Math.abs(zahl);
        int quadrat = zahl * zahl;
        boolean aussage_zahl_ist_gerade = (zahl%2==0);
        System.out.println("Betrag: " + betrag);
        System.out.println("Quadrat: " + quadrat);
        System.out.println("Aussage ist gerade: " + aussage_zahl_ist_gerade);

    }


}
