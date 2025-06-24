package Es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rndm = new Random();

        System.out.println("INserisci il numero di valori da generare");
        int N = Integer.parseInt(scanner.nextLine());

        //devo usare Integer, non accetta int
        //ArrayList<Integer> nums = new ArrayList<>();
        //uso upcasting
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nums.add(rndm.nextInt(101));
        }

        Collections.sort(nums);
        System.out.println("La lista ordinata è: " + nums);

        //creo una seconda lista con gli elementi della prima a cu iaggiungere poi la lista invertita
        List<Integer> secondNums = new ArrayList<>(nums);
        List<Integer> toInvert = new ArrayList<>(nums);

        Collections.reverse(toInvert);
        secondNums.addAll(toInvert);

        System.out.println("La lista a specchio è: " + secondNums);

        //determino la stampa di pari o dispari
        System.out.println("Digita true per stampare i numeri pari della lista, false per quelli dispari");
        //true=evenNums, false=!evenNums
        boolean evenNums = Boolean.parseBoolean(scanner.nextLine());

        for (int i = 0; i < secondNums.size(); i++) {
            if (i % 2 == 0 && evenNums) {
                System.out.println(secondNums.get(i));
            } else if (i % 2 != 0 && !evenNums) {
                System.out.println(secondNums.get(i));
            }
        }

        scanner.close();
    }
}
