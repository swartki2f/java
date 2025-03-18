
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

        int [] tab = {12,15,13,16,17,9,6,5,0};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("entrer un nombre: ");
        int x = scanner.nextInt();

        for(int i= 0; i < tab.length;i++){
            if (tab[i]==x){
                System.out.println("L'entier " + x + " a été trouvé dans le tableau.");
     
            }
            else{
                System.out.println("L'entier " + x + " n'est pas présent dans le tableau.");
 
            }
        }
    
        
    }
    
}
