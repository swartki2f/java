import java.util.Scanner;

public class ModificationTableau4 {
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tableau avant modification : ");
        afficherTableau(tab);

        System.out.print("Entrez un indice (0 à " + (tab.length - 1) + ") : ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < tab.length) {
            System.out.print("Entrez un entier à insérer à l'indice " + indice + " : ");
            int x = scanner.nextInt();
            tab[indice] = x;

            System.out.println("Tableau après modification : ");
            afficherTableau(tab);
        } else {
            System.out.println("Indice invalide.");
        }
    }

    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
