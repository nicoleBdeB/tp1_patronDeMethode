/**
 * @author nicole rémillard
 * premier jeu de dés qui respecte le patron de méthode
 */
public class JeuDes extends JeuDeSociete
{
    private int nbreDe;
    private int scoreMax;
    private int[] scoreJoueurs;

    //constructeur pour choisir nombre de dés et score à atteindre
    public JeuDes(int nbreDes, int scoreMaximum)
    {
        super();
        this.nbreDe = nbreDes;
        this.scoreMax = scoreMaximum;
    }
    @Override
    void initialiser() {
        System.out.println("Bonne partie de dés!");
        System.out.println("vous devez atteindre "+scoreMax);
        //initialiser les scores
        scoreJoueurs = new int[nombreDeJoueurs];
        for (int i = 0; i < nombreDeJoueurs; i++) {
            scoreJoueurs[i] = 0;
        }
    }

    @Override
    void jouer(int joueurNumero) {
        //lancer le nombre de dés et ajouter le total au score du joueur
        for (int i = 0; i < nbreDe; i++) {
            scoreJoueurs[joueurNumero] += (int)(Math.random()*6)+1;
        }
        System.out.println("le score du joueur "+joueurNumero+" est maintenant de "+scoreJoueurs[joueurNumero]);
    }

    @Override
    boolean estTermine() {
        for (int i = 0; i < nombreDeJoueurs; i++) {
            if (scoreJoueurs[i] >= scoreMax) {
                System.out.println("le joueur "+i+" a gagné la partie");
                return true;
            }
        }
        return false;
    }
}
