



public class Main {
    public static void main(String[] args) {
        int zahl1 = 1;
        int zahl2 = 2;

        int resultat = zahl1 + zahl2;
        zahl1 = zahl2 + 1;
        zahl2 = 5;
        System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(resultat);
        for (int i = 0; i <= 6; i++){
            System.out.println("for: " + i);
            resultat = resultat + 1;
        }
        System.out.println("fertig");
    }
}