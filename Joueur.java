public class Joueur

{
	private String joueur ;
	private boolean couleurJ;
	private Piece p;
	
	

	public Joueur(String unJoueur, boolean uneCouleur)
	{
		this.joueur = unJoueur;
		this.couleurJ = uneCouleur;
		
		
	}
	public boolean getJoueurCouleur()
	{
		return this.couleurJ ;
		
		
		
	}
	public String getJoueurNomCoul()
	{
		
		if (couleurJ)
		    return " Joueur blanc ";
		else 
		    return " Joueur noir " ; 
	}
	
	
	public String getJoueurPieceCoul()
	
	{
		
		if (this.couleurJ == true  )
		
		{
			
			
			return " vous possedez les pieces blanches ";
			
		}
		else 
            	
		    return "vous possedez les pieces noirs ";
		
	}
	
	public String toString()
	{
		return " Vous etes le " + this.getJoueurNomCoul() + "\n" 
		                        + this.getJoueurPieceCoul();
		
		
		
		
	}
	
	
	
	
	


}
//fin classe Joueur
