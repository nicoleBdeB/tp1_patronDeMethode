/**
 * @author nicole rémillard
 * pratique de patron d'architecture : patron de méthode
 */
public abstract class JeuDeSociete
{
    protected int nombreDeJoueurs;
    abstract void initialiser();
    abstract void jouer(int joueurNumero);
    abstract boolean estTermine();
    final void  jouerUnePartie(int nbreJoueurs)
    {
        nombreDeJoueurs = nbreJoueurs;
        initialiser();
        int joueurNo = 0;
        while(!estTermine())
        {
            jouer(joueurNo);
            joueurNo=(joueurNo+1)%nombreDeJoueurs;
        }
    }
}
