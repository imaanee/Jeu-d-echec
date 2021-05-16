public abstract class Piece {

	// Piece définiti par un type et une couleur

	private String type;
	private String couleur;
	
	
	public Piece(String unType, String uneCouleur) {
		this.type    = unType;
		this.couleur = uneCouleur;
	}
	
	public String getType () {
		return this.type;
	}
	
	public String getCouleur () {
		return this.couleur;
	}

	public String toString () {
		return this.getType() + this.getCouleur();
	}


}
