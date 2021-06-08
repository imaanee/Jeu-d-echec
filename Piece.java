public class Piece {

	// VARIABLES ======================================================================

	private String  nom    ;    // le nom correspond au type de piece : Tour, Roi, Pion etc
	private boolean couleur;   // on admettra true est une piece blanche, false est une piece noire
	private Case     c     ; 
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une piece
	 */
	public Piece(String unNom, boolean uneCouleur, Case uneCase) 
	{
		this.nom     = unNom;
		this.couleur = uneCouleur;
		this.c       = uneCase   ;
		this.c.setVide(false)    ;
	}
	// fin constructeur
	
	
	// METHODES D'ACCES ===============================================================
	
	/**
	 *   retourne le nom de la piece courante
	 */
	public String getNom()
	{
		return this.nom;
	}
	// fin methode getNom
	
	
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
			return "B";
		else
			return "N";
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
		return  this.getNom()        + ""   + 
		        this.getNomCouleur() + " "  + 
				this.getCase()              ;
	}
	// fin methode toString


}
// fin classe Piece
