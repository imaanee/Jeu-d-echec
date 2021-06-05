public class Case {
	
	// VARIABLES ======================================================================
	
	private boolean couleur;    // on admettra true est une case blanche, false est une case noire
	private int     ligne  ;
	private int     colonne;
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une case
	 */
	public Case(boolean uneCouleur, int uneLigne, int uneColonne)
	{
		this.couleur = uneCouleur;
		this.ligne   = uneLigne  ;
		this.colonne = uneColonne;
	}
	// fin du constructeur
	
	
	// METHODES D'ACCES ===============================================================
	
	/**
	 *   retourne le boolean de la case courante
	 */
	public boolean getCouleur()
	{
		return this.couleur;
	}
	// fin methode getCouleur
	
	
	/**
	 *   retourne la couleur de la case courante
	    on admettra que true pour une case blanche et case une piece noire
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
	 *   retourne la ligne de la case courante
	 */
	public int getLigne()
	{
		return this.ligne;
	}
	// fin methode getLigne
	
	
	/**
	 *   retourne le chiffre correspondant à la colonne de la case courante
	 */
	public int getColonne()
	{
		return this.colonne;
	}
	// fin methode getColonne
	
	
	/**
	 *   retourne le nom de colonne de la case courante
	 */
	public String getNomColonne()
	{
		switch(this.colonne)
		{
			case 1  : return "A" ;
			case 2  : return "B" ;
			case 3  : return "C" ;
			case 4  : return "D" ;
			case 5  : return "E" ;
			case 6  : return "F" ;
			case 7  : return "G" ;
			case 8  : return "H" ;
			default : return "?" ;
		}
	}
	// fin methode getNomColonne
	
	
	public String toString()
	{
		return "une case " + this.getNomCouleur() +
			   " sur la ligne "       + this.getLigne()      +   
			   " et sur la colonne "  + this.getNomColonne()    ;
	}
	

}
// fin de la classe Case
