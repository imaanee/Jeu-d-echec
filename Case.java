public class Case {
	
	// VARIABLES ======================================================================
	
	private boolean couleur;    // on admettra true est une case blanche, false est une case noire
	private int     ligne  ;
	private int     colonne;
	private boolean vide   ;   // true la case est vide, false une piece est sur la case
	private Piece   p      ;  // Piece qui se situe sur la case, p = null si la case est vide
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une case
	 */
	public Case(boolean uneCouleur, int uneLigne, int uneColonne)
	{
		this.couleur = uneCouleur; 
		this.ligne   = uneLigne  ;
		this.colonne = uneColonne;
		this.vide    = true      ;
	}
	// fin du constructeur
	
	
	// METHODES D'ACCES ===============================================================
	
	/**
	 *   retourne le boolean qui represente la couleur de la case courante
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


	/**
	 *   retourne le boolean qui represente si la case est vide de la case courante
	 */
	public boolean getVide()
	{
		return this.vide;
	}
	// fin methode getVide
	
	
	/**
	 *   retourne la chaine de caractere correspondante selon si une piece se trouve sur la case courante ou non
	 */
	public String getNomVide()
	{
		if (vide)
			return " case vide";
		else
			return " une piece est sur la case";
	}
	// fin methode getNomVide

	
	/**
	 *   si une case n'est pas vide retourne la chaine de caractere correspondant a la piece, retourne "case vide" sinon
	 */
	public String getPiece()
	{
		if (this.p == null) return "case vide";
		
		else return p.toString();
	}
	// fin methode getPiece


	/**
	 *   permet de changer la case en tant que vide ou non
	 */
	public void setVide(boolean v)
	{
		this.vide = v;
	}
	// fin methode getNomVide


	/**
	 *   permet a la case courante de savoir qu'elle piece se trouve sur elle
	 */
	public void setCase(Piece p)
	{
		Case c = new Case(this.getCouleur(), this.getLigne(), this.getColonne());
		this.p = new Piece(p.getNom(), p.getCouleur(), p.getCase());
	}
	// fin methode setCase



	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  retourne la chaine de caracteres representant la piece courante
	 */
	public String toString()
	{
		return "sur case "           + this.getNomCouleur() +
			   " " + this.getLigne() + this.getNomColonne() ;
	}
	// fin methode toString

}
// fin de la classe Case
