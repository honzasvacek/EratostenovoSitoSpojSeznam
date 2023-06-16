import java.util.Iterator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Sito sito = new Sito(sc.nextInt());

        sito.vytvorSeznam();

        System.out.println(sito);
    }
}