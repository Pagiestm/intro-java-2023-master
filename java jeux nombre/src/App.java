import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ChoisirUnNombre;
        int DevineLeNombre;
        String reponse;

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.println("Entrer un nombre : ");
        Scanner scan = new Scanner(System.in);
        ChoisirUnNombre = scan.nextInt();
        Random random = new Random();
        DevineLeNombre = random.nextInt(100) + 1;
        System.out.println("Le nombre choisie est : " + ChoisirUnNombre);
        System.out.println("Le nombre auquel je pensais était : " + DevineLeNombre);

        boolean onContinue = true;
        while (onContinue) {

            if (ChoisirUnNombre == DevineLeNombre) {
                System.out.println("Vous avez gagner !");
                onContinue = false;
            }

            if (ChoisirUnNombre != DevineLeNombre) {
                System.out.println("Vous avez perdu !");
                onContinue = false;
            }

            if (ChoisirUnNombre < DevineLeNombre) {
                int resultat = DevineLeNombre - ChoisirUnNombre;
                System.out.println("Vous étiez à " + resultat + " de la bonne réponse.");
            } else {
                int resultat = ChoisirUnNombre - DevineLeNombre;
                System.out.println("Vous étiez à " + resultat + " de la bonne réponse.");
            }

            scan.nextLine();
            System.out.println("Voulez vous continuer ? Oui ou Non ?");
            reponse = scan.nextLine();

            if (reponse.equals("oui")) {
                System.out.println("On continue");
                onContinue = true;
            }
            if (reponse.equals("non")) {
                System.out.println("On arrête");
                onContinue = false;
            }
        }
    }
}
