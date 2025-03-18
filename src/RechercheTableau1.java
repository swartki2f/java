import java.util.Scanner;

public class RechercheTableau1 {
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier à rechercher : ");
        int x = scanner.nextInt();

        boolean trouvé = false;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                trouvé = true;
                break;
            }
        }

        if (trouvé) {
            System.out.println("L'entier " + x + " a été trouvé dans le tableau.");
        } else {
            System.out.println("L'entier " + x + " n'est pas présent dans le tableau.");
        }
    }
}
