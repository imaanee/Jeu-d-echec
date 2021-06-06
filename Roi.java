public class Roi extends Piece {
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise un roi, on appelera roi "K" pour King (afin de le diferrencier de la reine)
	 */	
	public Roi(boolean uneCouleur, Case c) 
	{
		super("K", uneCouleur, c);
	}
	// fin du constructeur
	
	
	// METHODES ========================================================================
	
	/**
	 *   Verifie si le deplacement du depart a l'arrive est valide
	 * return true si c'est le cas et false sinon
	 */		
	public boolean deplacementValid(Case arrivee)
	{
		Case depart = this.getCase();
		int ligneDep = depart.getLigne()  ;
		int colDep   = depart.getColonne();
		
		int ligneArr = arrivee.getLigne()  ;
		int colArr   = arrivee.getColonne();
		
		if (depart == arrivee) return false;
		
		if (ligneArr > ligneDep + 1 || ligneArr < ligneDep - 1) return false;
		
		if (colArr > colDep + 1 || colArr < colDep - 1) return false;
		
		return true;		
	}
	// fin methode deplacement valide
	

	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant le roi courant
	 */
	public String toString() 
	{
		return super.toString();		
	}
	//fin methode toString
	
	
}
// fin classe Roi
