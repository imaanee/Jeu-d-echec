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
	
	
	/**
	 *   Retourne le nom de l'arbitre courant
	 */
	public String getNomA()
	{
		return this.nom;
	}
	//fin methode getEchiquier
	

	// METHODES =======================================================================
	
	/**
	 *   Lorsqu'un deplacement est valide, verifie si un obstacle se trouve sur sa trajectoir
	 *   Remarque : seul le cavalier peut passer par dessus un obstacle, les autres pieces ne le peuvent pas
	 */
	public boolean VerifObstacle(Case depart, Case arrivee) //pas besoin echiquier
	{
		Piece p = this.e.creerPiece(depart);
		
		//Case depart = p.getCase(); // p.getCase() return this.c
		
		int ligneDep = depart.getLigne()  ; 
		int colDep   = depart.getColonne(); 
		
		//Case arrivee = e.getCaseEch();
		int ligneArr = arrivee.getLigne()  ;    
		int colArr   = arrivee.getColonne();	
		
		
		//on commence par verifier si la case d'arrivee est vide et si le deplacement est valide
		if ((p.deplacementValid(arrivee) == true) )
		{
			
			boolean b1 = this.e.getPieceEch(depart).getCouleur();
			boolean b2;
			if ( this.e.getPieceEch(arrivee) != null) b2 = this.e.getPieceEch(arrivee).getCouleur();
			else  b2 = b1;
			
			
			if ( (arrivee.getVide() == true) || ( (arrivee.getVide() == false) && ( b1 != b2) ) )
			{
				
			
				System.out.println("entre dans 1er if : case arr est vide et deplacement est valide");
				if (depart.getNomPiece().substring(0, 1).equals("C")) return true; //traitement du cavalier
			
			
				// on verifie lorsque deplacement sur une meme colonne --> mouvement vertical
				if (colArr == colDep) 
				{
					// premier cas : deplacement du bas vers le haut
					if (ligneArr > ligneDep)
					{	
						System.out.println("deplacement bas vers le haut ");
						Case inter = depart;
						while (ligneArr > ligneDep)
						{
							ligneDep +=1;
					
							inter = this.e.getCaseEch(ligneDep, colDep);
							inter.equals(this.e.getCaseEch(ligneDep, colDep));
					
							if ( inter.getVide() == false) return false;
						}
						
						if (ligneDep == ligneArr) return true;
					}
					//fin cas deplacement vertical du bas vers le haut
				
					//second cas : deplacement haut vers le bas
					else if (ligneArr < ligneDep)
					{				
						System.out.println("deplacement haut vers le bas ");
						Case inter2 = depart;
				
						while (ligneArr < ligneDep)
						{
							ligneDep -= 1;
					
							inter2 = this.e.getCaseEch(ligneDep, colDep);
							inter2.equals(this.e.getCaseEch(ligneDep, colDep));
					
							if ( inter2.getVide() == false) ligneDep = 20;
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
							inter3.equals(this.e.getCaseEch(ligneDep, colDep));
					
							if ( inter3.getVide() == false) colDep = 20;
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
							inter4.equals(this.e.getCaseEch(ligneDep, colDep));
					
							if ( inter4.getVide() == false) ligneDep = 20;
						}
						if (colDep == colArr) return true;
					}
					//fin cas deplacement horizontal de la droite vers la gauche
				}
				//fin verification horizontale
			
			
				//ici on verifie les deplacements en diagonales
				if ( (colArr != colDep) && (ligneArr != ligneDep) )
				{
				
					//deplacement diagonale droite-haut
					if ( (colArr > colDep) && (ligneArr > ligneDep) )
					{
						Case inter5 = depart;
					
						while((ligneArr > ligneDep))
						{
							ligneDep += 1;
							colDep   += 1;
						
							inter5 = this.e.getCaseEch(ligneDep, colDep);
							inter5.equals(this.e.getCaseEch(ligneDep, colDep));
						
							if ( inter5.getVide() == false) ligneDep = 20;
						}
					
						if (ligneDep == ligneArr) return true;
					
					}
					//fin verification obstacle sur diagonale droite-haut
				
					//deplacement diagonale droite-bas
					if ( (colArr > colDep) && (ligneArr < ligneDep) )
					{
						Case inter6 = depart;
					
						while((ligneArr > ligneDep))
						{
							ligneDep -= 1;
							colDep   += 1;
						
							inter6 = this.e.getCaseEch(ligneDep, colDep);
							inter6.equals(this.e.getCaseEch(ligneDep, colDep));
						
							if ( inter6.getVide() == false) ligneDep = 20;
						}
					
						if (ligneDep == ligneArr) return true;
					
					}
					//fin verification obstacle sur diagonale droite-bas
				
				
					//deplacement diagonale gauche-haut
					if ( (colArr < colDep) && (ligneArr > ligneDep) )
					{
						Case inter7 = depart;
					
						while((ligneArr > ligneDep))
						{
							ligneDep += 1;
							colDep   -= 1;
						
							inter7 = this.e.getCaseEch(ligneDep, colDep);
							inter7.equals(this.e.getCaseEch(ligneDep, colDep));
						
							if ( inter7.getVide() == false) ligneDep = 20;
						}
					
						if (ligneDep == ligneArr) return true;
						
					}
					//fin verification obstacle sur diagonale gauche-haut
				
					//deplacement diagonale gauche-bas
					if ( (colArr < colDep) && (ligneArr < ligneDep) )
					{
						System.out.println("entre dans diag gauche-bas");
						Case inter8 = depart;
						System.out.println("hohoho");
						while( (ligneArr < ligneDep) )
						{
							ligneDep -= 1;
							colDep   -= 1;
						
							inter8 = this.e.getCaseEch(ligneDep, colDep);
							inter8.equals(this.e.getCaseEch(ligneDep, colDep));
							System.out.println("hey");
							//if ( inter8.getVide() == false) ligneDep = 20;
						}
					
						if (ligneDep == ligneArr) return true;
					
					}
					//fin verification obstacle sur diagonale gauche-bas
					
					
					
				}		
			
			

				else System.out.println("attention obstacle : deplacement invalide");
			}
			
		}	
		
		return false;
	}   
	//fin methode VerifObstacle 
	
	
	
	/**
	 *   Verifie si lors d'un deplacement le roi n'est pas mis en echec
	 *   Si c'est le cas : le deplacement est invalide
	 */	
	public boolean echecAuRoi(Case depart, Case arrivee)
	{
		String couleur = depart.getPiece().getNomCouleur();
		
		this.e.changerEch(depart, arrivee);
		
		if (couleur.equals("B")) // on verifie echec au roi blanc
		{
			for (int i = 1; i <= 8; i ++)
			{
				for (int j = 1; j <= 8; j++)
				{
					Case k = this.e.caseDunePiece("KN");
					Case c = this.e.getCaseEch(i, j);
					if ( c.getVide() == false)
					{
						if (this.VerifObstacle(c,k)) return true;
					}						
				}
				
			}
			return false;
		}
		
		if (couleur.equals("N")) // on verifie echec au roi noir
		{
			for (int i = 1; i <= 8; i ++)
			{
				for (int j = 1; j <= 8; j++)
				{
					Case k = this.e.caseDunePiece("KB");
					Case c = this.e.getCaseEch(i, j);
					if ( c.getVide() == false)
					{
						if (this.VerifObstacle(c,k)) return true;
					}						
				}
				
			}
			return false;
		}
		
		return false;
	}
	// fin methode echecAuRoi
	
	// METHODES UTILITAIRES ============================================================
	
	/**
	 *  redefinition toString pour arbitre courant
	 */
	public String toString () 
	{
		return  "nom arbitre " + this.getNomA()     + 
			    " echiquier  " + this.getEchiquier();
	}
	// fin methode toString	
	
	
}
//fin classe Arbitre
