public class Pion extends Piece {
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise un pion
	 */	
	public Pion(boolean uneCouleur, Case c) 
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
		Case depart     = this.getCase();
		int ligneDep    = depart.getLigne()  ;
		int colDep      = depart.getColonne();
		//boolean coulDep = depart.getCouleur();
		
		int ligneArr    = arrivee.getLigne()  ;
		int colArr      = arrivee.getColonne();
		//boolean coulArr = arrivee.getCouleur();
		
		if (colArr != colDep)     return false;
		
		
		/** Attention pion blanc et noir ne se deplace pas dans la meme direction
		 *  On separe donc les cas
		 *  Premier deplacement possibilitee d'avancer de deux cases
		**/
		
		//Le pion est blanc
		if (super.getCouleur() == true)
		{
			if (ligneArr <= ligneDep) return false;
			
			if(ligneDep == 2 && (ligneArr > ligneDep + 2)) return false; // premier deplacement		
		}
		
		
		//Le pion est noir
		if (super.getCouleur() == false)
		{
			if (ligneArr >= ligneDep) return false;
			
			if(ligneDep == 7 && (ligneArr < ligneDep - 2)) return false; // premier deplacement		
		}
		
		return true;
	}
	// fin methode deplacement valide
	

	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant le pion courant
	 */
	public String toString() 
	{
		return "je suis un pion " + super.toString();		
	}
	//fin methode toString
	
	
}
// fin classe Pion
