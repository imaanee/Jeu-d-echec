public class  Case 
{
	private int ligne ; 
    private int colonne ;// je pense que c'est mieux de mettre int parce qu'avant d'etre un échiquier , c'est un tableau  (plateau ) avec 8 colonnes et 8 lignes ,  je propose qu'on fasse une méthode qui attribut les lettres des colonnes // 
	private boolean couleur ;
    
    public Case( String uneLigne , String uneColonne , uneCouleur )
	{
		this.ligne = uneLigne ; 
		this.colonne = uneColonne ;
		this.couleur = uneCouleur ;
	}
    
    public String getLigne()
	{
		return this.ligne ;
		
	}
	
	public String getColonne()
	{
		
		return this.getColonne;
	}
	
	
	public boolean getCouleur()
	{
		return this.couleur ;
	}
	
	
	public String toString()
	{
		
		String str = "ligne = " + this.getLigne +"\n"
		             "colonne = " + this.getColonne + "\n"
					 "couleur = "  + this.getCouleur ;
		return str;
	}
	


}
