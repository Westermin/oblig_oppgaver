import java.text.DecimalFormat;
import java.util.Scanner;

public class OppgaveO1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        float input = 0;
        System.out.println("Venglist skriv inn bruttoinntekten din: ");

            while (input <= 0)
            {
                try {input = sc.nextFloat();}
                catch (Exception e) {System.out.println("Ugyldig verdi, skriv inn på nytt"); sc.next();}
            }

            if     (input - 1021550>= 0)input *= 0.162; // 16,2%
            else if(input - 651250 >= 0)input *= 0.132; //13,2%
            else if(input - 260100 >= 0)input *= 0.04;  // 4%
            else if(input - 184800 >= 0)input *= 0.017; // 1,7%
            else if(input < 184800)
            {
                System.out.println("Din inntekt er for lav til å bli skattet");
                System.exit(1);
            }
        System.out.println("Du må betale: " +df.format(input)+ " NOK i skatt.");
        System.exit(1);
    }


}
