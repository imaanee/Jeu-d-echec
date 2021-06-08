public class Arbitre {
	
	// VARIABLES ======================================================================
	private String    nom;
	private Echiquier e  ;

	
	//CONSTRUCTEUR
	
	/**
	 *   Initialise un arbitre
	 */
	public Arbitre(String unNom, Echiquier unEchiquier)
	{
		this.nom = unNom      ;
		this.e   = unEchiquier;
	}
	//fin constructeur
	
	
	// METHODES D'ACCES ===============================================================

	/**
	 *   Retourne l'echiquier que gere l'arbitre courant
	 */
	public Echiquier getEchiquier()
	{
		return this.e;
	}
	//fin methode getEchiquier
	

	// METHODES =======================================================================
	
	/**
	 *   Lorsqu'un deplacement est valide, verifie si un obstacle se trouve sur sa trajectoir
	 *   Remarque : seul le cavalier peut passer par dessus un obstacle, les autres pieces ne le peuvent pas
	 */
	public boolean VerifObstacle(Piece p, Case depart, Case arrivee) //pas besoin echiquier
	{
		//Case depart = p.getCase(); // p.getCase() return this.c
		
		int ligneDep = depart.getLigne()  ;
		int colDep   = depart.getColonne();
		
		//Case arrivee = e.getCaseEch();
		int ligneArr = arrivee.getLigne()  ;
		int colArr   = arrivee.getColonne();
		
		//on commence par verifier si la case d'arrivee est vide et si le deplacement est valide
		if ( (arrivee.getVide() == true) && (p.deplacementValid(arrivee) == true) )
		{
			if (depart.getNomPiece().substring(0, 1).equals("C")) return true; //traitement du cavalier
			
			
			// on verifie lorsque deplacement sur une meme colonne --> mouvement vertical
			if (colArr == colDep) 
			{
				// premier cas : deplacement du bas vers le haut
				if (ligneArr > ligneDep)
				{	
					Case inter = depart;
					while (ligneArr > ligneDep)
					{
						ligneDep +=1;
					
						inter = this.e.getCaseEch(ligneDep, colDep);
					
						System.out.println("est ce que inter est vrmnt equals : " + inter.equals(this.e.getCaseEch(ligneDep, colDep)));
					
						if ( inter.getVide() == false) ligneDep = 20;
					
						else 
						{
							//System.out.println(this.toString());
							System.out.println("case intermediaire " + inter);
						}
					}
					
					if (ligneDep == ligneArr) return true;
				}
				//fin cas deplacement vertical du bas vers le haut
				
				//second cas : deplacement haut vers le bas
				if (ligneArr < ligneDep)
				{				
					Case inter2 = depart;
				
					while (ligneArr < ligneDep)
					{
						ligneDep = ligneDep - 1;
					
						inter2 = this.e.getCaseEch(ligneDep, colDep);
					
						System.out.println(" verticale bas vers haut est ce que inter est vrmnt equals : " + inter2.equals(this.e.getCaseEch(ligneDep, colDep)));
					
						if ( inter2.getVide() == false) ligneDep = 20;
					
						else 
						{
							//System.out.println(this.toString());
							System.out.println("case intermediaire " + inter2);
						}
					}
					
					if (ligneDep == ligneArr) return true;
				}
				//fin cas deplacement vertical du haut vers le bas
			}
			//fin verification verticale
			
			
			//ici on verifie lorsque cases sont sur une meme ligne : deplacement horizontal
			if (ligneArr == ligneDep)
			{
				//premier cas : deplacement de la gauche vers la droite
				if (colArr > colDep)
				{	
					Case inter3 = depart;
					
					while (colArr > colDep)
					{
						colDep +=1;
					
						inter3 = this.e.getCaseEch(ligneDep, colDep);
					
						System.out.println("est ce que inter est vrmnt equals : " + inter3.equals(this.e.getCaseEch(ligneDep, colDep)));
					
						if ( inter3.getVide() == false) colDep = 20;
					
						else 
						{
							//System.out.println(this.toString());
							System.out.println("case intermediaire " + inter3);
						}
					}
					
					if (colDep == colArr) return true;
				}
				//fin cas deplacement horizontal de la gauche vers la droite
				
				
				//second cas : deplacement de la droite vers la gauche
				if (colArr < colDep)
				{				
				
					Case inter4 = depart;
				
					while (colArr < colDep)
					{
						colDep -=1;
					
						inter4 = this.e.getCaseEch(ligneDep, colDep);
					
						System.out.println(" verticale bas vers haut est ce que inter est vrmnt equals : " + inter4.equals(this.e.getCaseEch(ligneDep, colDep)));
					
						if ( inter4.getVide() == false) ligneDep = 20;
					
						else 
						{
							//System.out.println(this.toString());
							System.out.println("case intermediaire " + inter4);
						}
					}
					if (colDep == colArr) return true;
				}
				//fin cas deplacement horizontal de la droite vers la gauche
			}
			//fin verification horizontale
			
			
			//ici on verifie les deplacements en diagonales
			
			
			
			
			

			
			
		}

		
		else System.out.println("attention obstacle : deplacement invalide");
		return false;
				
	}
	//fin methode VerifObstacle 
	
	

  
	
}
//fin classe Arbitre
