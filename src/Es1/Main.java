package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Scrivi il numero di elementi da inserire: ");
        int N = Integer.parseInt(scanner.nextLine());

        //due Set distinti in cui inserire le parole a seconda che esistano già o meno
        Set<String> singleWords = new HashSet<>();
        Set<String> multipleWords = new HashSet<>();

        //ciclo per tutte le N parole; se c'è già la inserisco in set parole multiple altrimenti nell'altro
        for (int i = 0; i < N; i++) {
            System.out.println("Digita la parola da inserire");
            String word = scanner.nextLine();

            if (!singleWords.add(word)) {
                multipleWords.add(word);
            }
        }

        //stampo num parole in ciascun set
        System.out.println("Il numero di parole ripetute è: " + multipleWords.size());
        System.out.println("Il numero di parole non ripetute è: " + singleWords.size());

        //stampo tutte le parole nel set singleWords
        System.out.println("La lista delle parole non ripetute è: ");
        for (String word : singleWords) {
            System.out.println(word);
        }
    }
}
