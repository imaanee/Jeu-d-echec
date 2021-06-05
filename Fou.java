public class Fou extends Piece 
{
	public Fou(boolean couleur, Case c)
	{
		
		super(couleur , c );
	}
	
	public String toString()
	{
		return super.toString() + "\n" + 
		" je suis un fou ";
		
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
		
		
		
		
		int t[] = { 1, 2, 3, 4, 5 , 6 , 7 ,8 };
		for ( int i = 1 ; i < t.length ; i++ )
        {
			if  (( debutColonne != arrivColonne )&& ( arrivLigne == debutLigne + i  ))
			{
				return true ; 
		    }
			
			
			 
			
		}		
		
		return false ; 

	
	}
		
}
