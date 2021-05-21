public abstract class Piece {

	// Une piece est définie par un type et une couleur

	private String type;
	private String couleur;
	private String posX;
	private String posY;
	
	
	public Piece(String unType, String uneCouleur, String initX, String initY) 
	{
		this.type    = unType;
		this.couleur = uneCouleur;
		this.posX = initX;
		this.posY = initY;
	}
	
	
	public String getType () {
		return this.type;
	}
	
	public String getCouleur () 
	{
		return this.couleur;
	}


	public String toString () 
	{
		return this.getType() + this.getCouleur();
	}


}
