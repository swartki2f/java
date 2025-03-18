import java.util.Scanner;

public class RecherchePremierIndice3 {
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier à rechercher : ");
        int x = scanner.nextInt();

        int premierIndice = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                premierIndice = i;
                break;  // On arrête dès qu'on trouve la première occurrence
            }
        }

        if (premierIndice != -1) {
            System.out.println("L'entier " + x + " est trouvé à l'indice " + premierIndice);
        } else {
            System.out.println("L'entier " + x + " n'est pas présent dans le tableau.");
        }
    }
}
