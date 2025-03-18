import java.util.Scanner;

public class EchangerElements5 {
    public static void main(String[] args) {
        int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tableau avant échange : ");
        afficherTableau(tab);

        System.out.print("Entrez le premier indice à échanger : ");
        int indice1 = scanner.nextInt();

        System.out.print("Entrez le deuxième indice à échanger : ");
        int indice2 = scanner.nextInt();

        if (indice1 >= 0 && indice1 < tab.length && indice2 >= 0 && indice2 < tab.length) {
            int temp = tab[indice1];
            tab[indice1] = tab[indice2];
            tab[indice2] = temp;

            System.out.println("Tableau après échange : ");
            afficherTableau(tab);
        } else {
            System.out.println("Un ou les deux indices sont invalides.");
        }
    }

    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
