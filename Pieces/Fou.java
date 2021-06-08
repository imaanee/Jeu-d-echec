public class Fou extends Piece 
{
	public Fou(boolean couleur, Case c)
	{
		super("F", couleur , c);
	}
	
	public String toString()
	{
		return super.toString();	
	}
	
	public boolean deplaceValid(Case arrivee) // la case d'arrivee
	{
		Case debut = this.getCase();
		
		int debutLigne = debut.getLigne();
		int arrivLigne = arrivee.getLigne();
		
		int debutColonne = debut.getColonne();
		int arrivColonne = arrivee.getColonne();
		
		if (debut == arrivee) return false;
		if ( debut.getCouleur() != arrivee.getCouleur() ) return false ; 
		
		for ( int i = 1 ; i < 8 ; i++ )
                {
			if  ( debutColonne != arrivColonne )
			{
				if (arrivLigne == debutLigne + i  ) return true ; 
				if (arrivLigne == debutLigne - i  ) return true ; 
		        }
		}		
		return false ; 
	 }
	
}
//fin classe fou
