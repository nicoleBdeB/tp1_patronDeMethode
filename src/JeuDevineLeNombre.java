import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * jeu de devinettes
 * l'ordinateur choisi un nombre et les joueurs essaient de deviner.
 */
public class JeuDevineLeNombre extends JeuDeSociete
{
    private int nombreTour=1;
    private int nombreMaximum;
    private int nombreTourMax;
    private int nombreADeviner;
    int nbr;//le nombre entré par un joueur

    public JeuDevineLeNombre(int nombreTourMax, int nombreMaximum) {
        this.nombreTourMax = nombreTourMax;
        this.nombreMaximum = nombreMaximum;
    }

    @Override
    void initialiser() {
        //l'ordinateur choisi un nombre entre 1 et nombreMaximum
        nombreADeviner = (int)(Math.random()*nombreMaximum)+1;
    }

    @Override
    void jouer(int joueurNumero) {
        try {                                       //bloc try pour s'assurer que ne scanner ne retourne pas une erreur
            Scanner sc = new Scanner(System.in);
            System.out.println("Joueur "+joueurNumero+", taper un nombre entier : ");
            nbr = sc.nextInt();

        }catch (InputMismatchException e1){
            System.out.println("vous devriez taper un nombre, vous auriez plus de chance de gagner");
        }
        finally{
            nombreTour++;
        }
    }

    @Override
    boolean estTermine() {
        if (nbr==nombreADeviner) {
            System.out.println("Bravo! Vous avez bien deviné");
            return true;
        }
        if(nombreTour>nombreTourMax*nombreDeJoueurs) {
            System.out.println("vous avez perdu, meilleure chance la prochaine fois");
            return true;
        }
        return false;
    }
}
