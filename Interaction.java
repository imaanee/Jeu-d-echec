public class Interaction {
	
	private Partie partie;
	
	
/**	
	public boolean JouerPartie() //true pour charger partie et false pour nouvelle partie
	{
		System.out.println("Jeu d'echec" + "\n" + "Pour charger une partie tapez 1 sinon tapez 2");
		Scanner scan = new Scanner(System.in);
		int choixJ = scan.nextInt();
		
		if (choixJ == 1) return ;
	
		else if (choixJ == 2) System.out.println("Le joueur 2 jouera les blanc");
		
		
		
		else ( (choixJ != 1) && (choixJ != 2) )
		{
			System.out.println("\n" + "Attention erreur de saisie! Veuillez tapez :" + "\n" + "1 pour charger une partie" + "\n" + "2 pour commencer une nouvelle partie" + "\n");
		    scan = new Scanner(System.in);
			choixJ = scan.nextInt();
		}

		
		
	}
	
	
	**/
	
	
	
	
	
	
	
	
	
	public int ChoixJoueurBlanc() // ca c'est uniquement si nouvelle partie
	{
		System.out.println("Bienvenue dans cette nouvelle partie. Commencons par determiner le joueur Blanc" + "\n" + "Tapez 1 si vous voulez que le Joueur 1 joue les pions blanc" + "\n" + "Tapez 2 si vous voulez que le Joueur 2 joue les pions blanc" + "\n" + "Tapez 3 si vous voulez generer un choix aleatoire" + "\n");
		Scanner scan = new Scanner(System.in);
		int choixJ = scan.nextInt();
		
		if ( (choixJ != 1) && (choixJ != 2) && (choixJ != 3) )
		{
			System.out.println("\n" + "Attention erreur de saisie! Veuillez tapez :" + "\n" + "1 si le Joueur 1 joue les blanc" + "\n" + "2 si le Joueur 2 joue les blanc" + "\n" + "3 si vous voulez generer un choix aleatoire" + "\n");
		    scan = new Scanner(System.in);
			choixJ = scan.nextInt();
		} 
		
		if (choixJ == 3) 
		{
			double j = Math.random();
			double k = Math.random();
			
			if (j < k) choixJ = 1;
			else choixJ = 2;
		}
		
		if (choixJ == 1) System.out.println("Le joueur 1 jouera les blanc");
			
		if (choixJ == 2) System.out.println("Le joueur 2 jouera les blanc");
		
	return choixJ;
	}
	
	
	

	
}
