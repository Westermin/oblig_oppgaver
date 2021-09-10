import static javax.swing.JOptionPane.showInputDialog;
public class OppgaveO1 {
    public static void main(String[] args) {
        int input = Integer.parseInt(showInputDialog("Hva er bruttoinntekten? "));
        if(input <= 164100){                                             // For lite inntekt
            System.out.println("Du har for lite inntekt for å skatte");
            System.exit(1);
        }
        else if (input > 164100 && input <= 230950) input *= 0.0093;   // 0,93%  Trinn 1
        else if (input > 230950 && input <=580650)  input *= 0.0241;   // 2,41%  Trinn 2
        else if (input > 580650 && input <=934050)  input *= 0.01152;  // 11,52% Trinn 3
        else if (input >=934050)                    input *= 0.01452;  // 14,52% Trinn 4


        System.out.println("Du er nødt til å skatte " + input + " NOK");
    }

}
