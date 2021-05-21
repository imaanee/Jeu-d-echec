public abstract class Piece {

	// VARIABLES ======================================================================

	private String type;
	private String couleur;
	private String posX;
	private String posY;
	
	// CONSTRUCTEUR ===================================================================
	
	/**
	 *   Initialise une piece
	 */
	public Piece(String unType, String uneCouleur, String initX, String initY) 
	{
		this.type    = unType;
		this.couleur = uneCouleur;
		this.posX = initX;
		this.posY = initY;
	}
	// fin constructeur
	
	
	
	// METHODES D'ACCES ===============================================================
	
	
	/**
	 *   retourne le type de la piece courante
	 */
	public String getType() {
		return this.type;
	}
	// fin methode getType
	
	
	/**
	 *   retourne la couleur de la piece courante
	 */
	public String getCouleur() 
	{
		return this.couleur;
	}
	// fin methode getCouleur
	
	
	/**
	 *   retourne la postion actuelle en abscisse de la piece courante
	 */
	public String getPosX() {
		return this.posX;
	}
	// fin methode getPosX
	
	
	/**
	 *   retourne la postion actuelle en ordonnee de la piece courante
	 */
	public String getPosY() {
		return this.posY;
	}
	// fin methode getPosY
	
	
	
	// METHODES UTILITAIRES ============================================================
	
	
	/**
	 *  retourne la chaine de caracteres representant la piece courante
	 */
	public String toString () 
	{
		return "piece : "              + this.getType() + 
			   " couleur : "           + this.getCouleur() + 
			   "position abscisse : "  + this.getPosX() +
			   " position ordonnee : " + this.getPosY();
	}
	// fin methode toString


}