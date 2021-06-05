public abstract class Piece {

	// VARIABLES ======================================================================

	private boolean couleur;   // on admettra true est une piece blanche, false est une piece noire
	private Case     c     ; 
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une piece
	 */
	public Piece(boolean uneCouleur, Case uneCase) 
	{
		this.couleur = uneCouleur;
		this.c       = uneCase   ;
	}
	// fin constructeur
	
	
	// METHODES D'ACCES ===============================================================
	
	/**
	 *   retourne le boolean de la piece courante
	 */
	public boolean getCouleur()
	{
		return this.couleur;
	}
	// fin methode getCouleur
	
	
	/**
	 *   retourne la couleur de la piece courante
	 */
	public String getNomCouleur()
	{
		if (couleur)
			return "blanche";
		else
			return "noire";
	}
	// fin methode getNomCouleur
	
	
	/**
	 *   retourne la case sur laquelle se trouve la piece courante
	 */
	public Case getCase()
	{
		return this.c;
	}
	// fin methode getCase
		
	
	
	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant la piece courante
	 */
	public String toString () 
	{
		return "je suis une piece de couleur  " + this.getNomCouleur() + 
		       " sur "				+ this.getCase();
	}
	// fin methode toString


}
