import java.util.ArrayList;
import java.util.Scanner;

/*
1. das eingegebene String scannen
2. überprüfe die Länge des Passworts
3. überprüfe, ob Zahlen enthalten sind
 */
public class PassValidierung {

    //public static Scanner scan = new Scanner(System.in);
    //public static String eingabe = scan.nextLine();
    //public static int lengthEingabe = eingabe.length();

    public static void main(String[] args) {

        System.out.println("Bitte geben Sie Ihr Passwort ein: ");
        Scanner scan = new Scanner(System.in);
        String eingabe = scan.nextLine();
        //int lengthEingabe = eingabe.length();
        istLang(eingabe.length());
        istZahlen(eingabe);
    }

    public static boolean istLang(int lengthEingabe) {

        if (lengthEingabe < 8) {
            System.out.println("Ihr gegebenes Passwort has nur " + lengthEingabe +
                    " Ziffer. Ein Passwort soll mindestens 8 Ziffer enthalten." +
                    " Geben Sie bitte ein neues Passwort");
            return false;
        } else {
            System.out.println("Ihr Passwort ist lang genug.");
            return true;
        }
    }

    public static boolean zahlen(String eingabe) {
        int lengthEingabe = eingabe.length();
        ArrayList<Integer> zahlList = new ArrayList<>();
        for (int i = 0; i < lengthEingabe; i++) {
            if (Character.isDigit(eingabe.charAt(i))) {
                zahlList.add(eingabe.charAt(i) - '0');
            }
        }

        if (zahlList.size() > 0) {
            //System.out.println(zahlList);
            return true;
        } else {
            return false;
        }
    }

    public static boolean istZahlen(String eingabe) {
        if (zahlen(eingabe)) {
            System.out.println("Ihr Passwort enthält Zahlen.");
            return true;
        } else {
            System.out.println("Ihr Passwort enthält keine Zahl.");
            return false;
        }
    }

//    public static boolean buchstabe(String eingabe){
//        int lengthEingabe = eingabe.length();
//        ArrayList<Integer> zahlList = new ArrayList<>();
//        for (int i = 0; i < lengthEingabe; i++) {
//            if (Character.isDigit(eingabe.charAt(i))) {
//                zahlList.add(eingabe.charAt(i) - '0');
//            }
//    }

}
