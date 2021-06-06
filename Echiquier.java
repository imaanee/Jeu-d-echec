public class Echiquier {
	
	// VARIABLES ======================================================================
	
	private Case[][] plateau; 
	private Piece    p      ;

	// CONSTRUCTEUR ===================================================================	
	/**
	 *   Initialise les cases de l'echiquier
	 */	
	public Echiquier() 
	{
		this.plateau = new Case[8][8];
		
		for (int i = 0; i<8; i++)
		{
			for (int j =0; j<8; j++)
			{
				if ( (i+j) %2 == 0)
				{
					this.plateau[i][j] = new Case(false, i+1, j+1);					
				}
				
				else 
				{
					this.plateau[i][j] = new Case(true, i+1, j+1);					
				}
			}
			// fin colonne j
		}
		//fin ligne i
	}
	// fin constructeur
	

	// METHODES =======================================================================
	
	/**
	 *   Initialise les positions de depart de chaque pieces
	 */		
	public void EchiquierInit()
	{
		for (int i = 0; i<8; i++)
		{
			for (int j =0; j<8; j++)
			{		
		
				if (i==0)  // premiere ligne echiquier pieces blancche
				{
					if (j==0 || j ==7)  
					{
						Piece p = new Tour(true, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==1 || j ==6) 
					{
						Piece p = new Cavalier(true, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==2 || j ==5) 
					{
						Piece p = new Fou(true, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==3) 
					{
						Piece p = new Reine(true, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==4) 
					{
						Piece p = new Roi(true, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
				}
				// fin ligne 1
				
				
				if (i==1) // deuxieme ligne que des pions blanc
				{
					Piece p = new Pion(true, this.plateau[i][j]);
					this.plateau[i][j].setCase(p);
				}
				// fin ligne 2
				
				
				if (i==6) // ligne 7 que des pions noirs
				{
					Piece p = new Pion(false, this.plateau[i][j]);
					this.plateau[i][j].setCase(p);
				}
				//fin ligne 7
				
				
				if (i==7) //derniere ligne pieces noires
				{
					if (j==0 || j ==7) 
					{
						Piece p = new Tour(false, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==1 || j ==6) 
					{
						Piece p = new Cavalier(false, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==2 || j ==5) 
					{
						Piece p = new Fou(false, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==3) 
					{
						Piece p = new Reine(false, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
					if (j==4) 
					{
						Piece p = new Roi(false, this.plateau[i][j]);
						this.plateau[i][j].setCase(p);
					}
					
				}
				//fin ligne 8
				
			}
			// fin colonne j
			
		}
		// fin ligne i
		
	}
	// fin methode EchequierInit
	
	/**
	 *   Parcours l'echiquier 
	 *  Affiche si la case courante est vide sinon affiche le nom de la piece et la case sur laquelle elle se trouve
	 */		
	public void afficher() 
	{
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < 8; j++)
			{
				System.out.println(this.plateau[i][j].getPiece());
			}
		}
		
	}
	// fin methode afficher
	
	
	/**
	 *   Permet d'afficher l'echiquier sous la forme d'un plateau de jeu d'echec 
	 */	
	public void affichePlateau() 
	{
		System.out.println("     A    B    C    D    E    F    G    H ");   // nom des colonnes
		System.out.println("   ---------------------------------------");
		
		for (int i = 7; i >= 0; i--)  // On commence par la ligne 7 et on decremente
		{
			String str = " ";
			for (int j = 0; j < 8; j++)
			{
				if (this.plateau[i][j].getVide()) str += "|    ";  // si la case est nulle
	
				else 
				{
	
					String ch = "";
					ch = this.plateau[i][j].getPiece().substring(0, 2);
				
					str += "| " + ch + " ";
				}
			}
			// fin colonne j
			
			System.out.println(String.valueOf(i+1) + str + "| " + String.valueOf(i+1));
			System.out.println("   ---------------------------------------");
			
		}
		//fin ligne i
		
		System.out.println("     A    B    C    D    E    F    G    H ");	
	}
	// fin de la methode AffichePlateau

	public Case getCaseEch(int i, int j)
	{
		return this.plateau[i][j];
		
	}

	
}
//fin classe Echiquier
