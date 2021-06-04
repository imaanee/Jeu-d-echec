public class Tour extends Piece {
	
	
	public Tour(String couleur , String type)
	{
		super(couleur , type);
		
		
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
