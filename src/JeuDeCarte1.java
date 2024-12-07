/**
 * @author nicole rémillard
 * jeu de carte très basique: tout le monde joue toutes ses cartes puis la partie se termine
 */

public class JeuDeCarte1 extends JeuDeSociete
{
    private int nbreCartes=7;
    private int compteur=0;
    @Override
    void initialiser() {
        //s'assurer de passer moins que 52 cartes
        while(nombreDeJoueurs*nbreCartes>52)
        {
            nbreCartes--;
        }
        System.out.println("Passer "+nbreCartes +" cartes aux joueurs");
    }

    @Override
    void jouer(int joueurNumero) {
        System.out.println("Joueur " + joueurNumero +" joue une carte");
        compteur++;
    }

    @Override
    boolean estTermine() {
        if(compteur<nbreCartes*nombreDeJoueurs)
        {
            System.out.println("toutes les cartes ont été jouées, la partie est terminée");
        }
        return compteur<nbreCartes*nombreDeJoueurs;
    }
}
