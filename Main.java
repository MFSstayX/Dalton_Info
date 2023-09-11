import java.util.Scanner;
public class Main {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in); 
        int eingabe = scanner.nextInt();
        System.out.println("Gebe eine Zahl von 1 - 3, um mein Lieblingsfilm zu erfahren");
        switch(eingabe) {
            case 1: {
                System.out.println("Interstellar");
                break; 
            }
            case 2: {
                System.out.println("Oppenheimer");
                break; 
            }
            case 3: {
                System.out.println("Outer Banks");
                break;
            }
            default: {
                System.out.println("Bitte verwende eine Zahl von 1 - 3.");
            }
        }
    }
}