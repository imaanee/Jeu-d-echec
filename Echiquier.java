public class Echiquier {
	
	
	private Case[][] plateau;
	private Piece p;
	
	
	
	public Echiquier() 
	{
		
		this.plateau = new Case[8][8];

		
		for(int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if ( (i+j) %2 == 0)
				{
					this.plateau[i][j] = new Case(false, i+1, j+1);					
				}
				
				else 
				{
					this.plateau[i][j] = new Case(true, i+1, j+1);					
				}
				
				
				if (i==0) 
				{
					if (j==0 || j ==7) 
					{
					Piece p = new Tour(true, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==1 || j ==6) 
					{
					Piece p = new Cavalier(true, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==2 || j ==5) 
					{
					Piece p = new Fou(true, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==3) 
					{
					Piece p = new Reine(true, this.plateau[i][j]);
					System.out.println(p);
					}
					
					
					if (j==4) 
					{
					Piece p = new Roi(true, this.plateau[i][j]);
					System.out.println(p);
					}
					
				}
				
				
				if (i==1) 
				{
					Piece p = new Pion(true, this.plateau[i][j]);
					System.out.println(p);
				}
				
				//position piece noire
				
				if (i==7) 
				{
					if (j==0 || j ==7) 
					{
					Piece p = new Tour(false, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==1 || j ==6) 
					{
					Piece p = new Cavalier(false, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==2 || j ==5) 
					{
					Piece p = new Fou(false, this.plateau[i][j]);
					System.out.println(p);
					}
					
					if (j==3) 
					{
					Piece p = new Reine(false, this.plateau[i][j]);
					System.out.println(p);
					}
					
					
					if (j==4) 
					{
					Piece p = new Roi(false, this.plateau[i][j]);
					System.out.println(p);
					}
					
				}
				
				if (i==6) 
				{
					Piece p = new Pion(false, this.plateau[i][j]);
					System.out.println(p);
				}

				if ( (i+j) %2 == 0)
				{
					this.plateau[i][j] = new Case(false, i+1, j+1);					
				}
				
				else 
				{
					this.plateau[i][j] = new Case(true, i+1, j+1);					
				}

			}
		}
		
	}
	
	

	
	

	
	public void afficher() 
	{
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < 8; j++)
			{
				System.out.println(this.plateau[i][j]);
			}
		}
		
		
	}
	
	
	
	public void affichePlateau() 
	{
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < 8; j++)
			{
				System.out.println("| " + this.plateau[i][j] + " ");
			}
			
		}
		System.out.println("|");
		System.out.println("-----------------------------------------------");
		
	}
	

	
	public String toString() 
	{
		return "voici echiquier " ;
		
		
	}
	
=
	
}
