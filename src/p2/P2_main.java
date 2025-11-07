package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 0;
        int E1 = 0;
        int E2 = 0;
        int E3 = 0;
        int E4 = 0;

        if (a == b) {E1 = 1;} 
        else {E1 = 0;}   //d++
        if (a == b || a == c) {E2 = 1;} 
        else {E2 = 0;}
        if (a+b >=c) {E3 = 1;} 
        else {E3 = 0;}
        if(a+b+c >= 100){E4 = 1;} 
        else {E4 = 0;}
        d= E1 + E2 + E3 + E4;
        System.out.println("d: " + d);
        
    }
}