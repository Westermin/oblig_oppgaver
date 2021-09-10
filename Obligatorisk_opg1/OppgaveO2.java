
import java.util.Scanner;
public class OppgaveO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=-1; char k= '\0';
        for(int i=1; i<=10; i++){
            System.out.println("Skriv inn poengsummen for å få ut karakter");
            p = sc.nextInt();
            System.out.println(p);
            while(p > 100 || p < 0) {
                System.out.println("Ugyldig poengsum, skriv inn på nytt");
                try{p = sc.nextInt();}
                catch(Exception e){
                    System.out.println("Ugyldig poengsum, skriv inn på nytt");
                    sc.next();
                }
            }
            if      (p - 89 > 0)k = 'A';
            else if (p - 79 > 0)k = 'B';
            else if (p - 59 > 0)k = 'C';
            else if (p - 49 > 0)k = 'D';
            else if (p - 39 > 0)k = 'E';
            else                k = 'F';
            System.out.println("Karakteren for student "+i+" er: " + k);
        }
    }
}
