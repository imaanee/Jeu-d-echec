public class Reine extends Piece {
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une Reine 
	 */	
	public Reine(boolean uneCouleur, Case c) 
	{
		super(uneCouleur, c);
	}
	// fin du constructeur
	
	
	// METHODES ========================================================================
	
	/**
	 *   Verifie si le deplacement du depart a l'arrive est valide
	 *  return true si c'est le cas et false sinon
	 *  dans le cas de la reine, il suffit de reprendre les verifications du fou et de la tour
	 */		
	public boolean deplacementValid(Case arrivee)
	{
		Case depart = this.getCase();
		int ligneDep = depart.getLigne()  ;
		int colDep   = depart.getColonne();
		
		int ligneArr = arrivee.getLigne()  ;
		int colArr   = arrivee.getColonne();
		
		
		// verification deplacement du fou
		
		for ( int i = 1 ; i < 8 ; i++ )
        {
			if  ( colDep != colArr )
			{ 
				if (ligneArr == ligneDep + i  ) return true ; 
				if (ligneArr == ligneDep - i  ) return true ; 
		    }
		}		
		
		
		// verfiication deplacement de la tour
		if (ligneArr == ligneDep && colArr != colDep) return true;
		if (colArr == colDep && ligneArr != ligneDep) return true;	


		return false;
		
	}
	// fin methode deplacement valide
	

	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant la reine courante
	 */
	public String toString() 
	{
		return "Reine " + super.toString();		
	}
	//fin methode toString
	
	
}
// fin classe Tour
