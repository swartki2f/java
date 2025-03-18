import java.util.Scanner;

public class RechercheDernierIndice2 {
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier à rechercher : ");
        int x = scanner.nextInt();

        int dernierIndice = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                dernierIndice = i;
            }
        }

        if (dernierIndice != -1) {
            System.out.println("L'entier " + x + " est trouvé à l'indice " + dernierIndice);
        } else {
            System.out.println("L'entier " + x + " n'est pas présent dans le tableau.");
        }
    }
}
