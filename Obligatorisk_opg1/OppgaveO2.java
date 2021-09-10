import static javax.swing.JOptionPane.showInputDialog;
public class OppgaveO2 {
    public static void main(String[] args) {
        int input;
        for (int i=0; i < 10; i++) {
            input = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));
            if(input <= 0 || input > 100){                                             // ugyldig poengsum
                System.out.println("Du har gitt ugyldig poengsum");
                i--;
            }
            else if (input > 0 && input <= 39)  System.out.println("Du har fått karakteren F");   // Karakter F
            else if (input > 40 && input <= 49) System.out.println("Du har fått karakteren E");  // Karakter E
            else if (input > 50 && input <=59)  System.out.println("Du har fått karakteren D"); // Karakter D
            else if (input > 60 && input <=79)  System.out.println("Du har fått karakteren C");  // Karakter C
            else if (input > 80 && input <=89)  System.out.println("Du har fått karakteren B");  // Karakter B
            else if (input > 90 && input <=100) System.out.println("Du har fått karakteren A");  // Karakter A
            else if (input > 100) System.out.println("Du har gitt ugyldig poengsum");

        }
    }
}
