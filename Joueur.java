public class Joueur{
	
	private boolean couleur;	//true le joueur joue pions blanc, false le joueur joue pions noir
	private int numJ;

	public Joueur(boolean uneCouleur, int unNumero)
	{
		this.couleur = uneCouleur;
		this.numJ    = unNumero  ;		
	}
	
	
	public getCouleur()
	{
		return this.couleur;		
	}
	
	public getNumJ()
	{
		return this.numJ;
	}

	
}
//fin classe Joueur
