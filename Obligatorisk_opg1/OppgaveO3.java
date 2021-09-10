import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class OppgaveO3 {
    public static void main(String[] args) {
        long tall;
        int in=-1,cube=0;
        BigDecimal f = new BigDecimal(1);
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols customSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        DecimalFormat formatter = new DecimalFormat("### ### ###");

        System.out.print("Skriv inn et heltall som skal bli fakultert: ");
        while(in<0){
            try{
                in = sc.nextInt();}
            catch(Exception e) {
                System.out.println("Ugyldig poengsum, skriv inn på nytt");
                sc.next();}
        }

        for (int i = 1; i <= in; i++) // Utregner Fakulle nummeret av input! fra input
            f = f.multiply(BigDecimal.valueOf(i));
        System.out.println("Fakulert nummer er: "+f);
        if(f.compareTo(BigDecimal.valueOf(Long.MAX_VALUE))>0){ // Sjekker om tallet er stort nok til å bli forkorttet
            for (cube = 0; f.compareTo(BigDecimal.valueOf(10)) > 0; cube++) {
                f = f.divide(BigDecimal.valueOf(10))
                            .setScale(9, RoundingMode.DOWN);
            }
            System.out.println("Fakulert nummer er: "+f+"^"+cube);
        }
        else{
            System.out.println("Fakulert nummer er: "+f);
        }

    }

}