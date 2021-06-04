public class Fou extends Piece 
{
	public Fou( String unType , String couleur , Case c)
	{
		
		super(couleur , c );
	}
	
	public String toString()
	{
		return super.toString();
		
	}
	public boolean coupValide(Case caseArriv) // la case d'arrivee
	{
		
		Case debut = this.getCase();
		
		int debutLigne = debut.getLigne();
		int arrivLigne = caseArriv.getLigne();
		
		
	}
