public class Tour extends Piece {
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une tour 
	 */	
	public Tour(boolean uneCouleur, Case c) 
	{
		super(uneCouleur, c);
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
		
		if (ligneArr == ligneDep && colArr != colDep) return true;
		
		if (colArr == colDep && ligneArr != ligneDep) return true;
		
		return false;	
	}
	// fin methode deplacement valide
	

	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant la tour courante
	 */
	public String toString() 
	{
		return "Tour " + super.toString();		
	}
	//fin methode toString
	
	
}
// fin classe Tour
