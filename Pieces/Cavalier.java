public class Cavalier extends Piece {
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise un cavalier
	 */	
	public Cavalier(boolean uneCouleur, Case c) 
	{
		super("C", uneCouleur, c);
		
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
		
		int verifL = (ligneArr - ligneDep) * (ligneArr - ligneDep);
		int verifC = (colArr   - colDep)   * (colArr   - colDep)  ;
		
		if ( (verifL + verifC) == 5) return true;
		
		return false;		
	}
	// fin methode deplacement valide
	

	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant le cavalier courant
	 */
	public String toString() 
	{
		return super.toString();		
	}
	//fin methode toString
	
	
}
// fin classe Cavalier
