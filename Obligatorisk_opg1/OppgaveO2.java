import java.util.Scanner;
public class OppgaveO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=-1; char k= '\0';
        System.out.println("Skriv inn poengsummen din for karakter");
        for(int i=0; i<10; i++){
        while(p > 100 || p < 0) {
            try{
                p = sc.nextInt();}
            catch(Exception e){
                System.out.println("Ugyldig poengsum, skriv inn på nytt");
                sc.next();}
            }
        if      (p - 89 > 0)k = 'A';
        else if (p - 79 > 0)k = 'B';
        else if (p - 59 > 0)k = 'C';
        else if (p - 49 > 0)k = 'D';
        else if (p - 39 > 0)k = 'E';
        else                k = 'F';
        System.out.println("Din karakter er: " + k);
        }
    }
}
