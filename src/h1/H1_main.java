package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -100.0;
        double monEingang = 200.0; 
        int rating = -2;
        boolean warnhinweis = false;
        boolean negativ;

        // negativ：guthaben < 0 ?
        negativ = guthaben < 0;

        // update rating
        if (guthaben > 0) {
            rating += 3;
        } else if (guthaben == 0) {
            rating += 2;
        } else { 
            double absMon = Math.abs(monEingang);
            double absGut = Math.abs(guthaben);
            if (absMon >= absGut) {
                rating += 1;
            } else { // absMon < absGut
                rating -= 1;
            }
        }

        // warnhinweis
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

       
        System.out.println("negativ = " + negativ);
        System.out.println("rating = " + rating);
        System.out.println("warnhinweis = " + warnhinweis);
    }
}
